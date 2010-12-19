(ns euler.level1.problem12)

(defn triangle-numbers []
  (map first (iterate (fn [[sum i]] [(+ i sum) (inc i)]) [1, 2])))

(defn divisors-of [n]
  (if (= 1 n)
    [1]
    (loop [i 2 max n divisors [1 n]]
      (if (>= i max)
        divisors
        (let [quotient (/ n i)]
          (if (integer? quotient)
            (recur (inc i) quotient (conj divisors i quotient))
            (recur (inc i) max divisors)))))))

(defn has-enough-divisors [min-divs]
  (fn [n]
    (let [divisors (divisors-of n)
          amt (count divisors)]
      (< min-divs amt))))

(defn euler-12 [min-divs]
  (let [check (has-enough-divisors min-divs)]
    (first
      (filter
        check
        (triangle-numbers)))))
