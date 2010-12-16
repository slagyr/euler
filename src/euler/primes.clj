(ns euler.primes)

(defn factors-of [n]
  (loop [factors [] divisor 2 n n]
    (if (<= n 1)
      factors
      (if (= 0 (rem n divisor))
        (recur (conj factors divisor) divisor (/ n divisor))
        (recur factors (inc divisor) n)))))

(declare primes)

(defn prime? [n]
  (if (< n 2)
    false
    (let [max-divisor (Math/sqrt n)
          prime-factors (take-while #(<= % max-divisor) primes)]
      (if (some #(zero? (rem n %)) prime-factors)
        false
        true))))

(defn- next-prime [n]
  (let [n (inc n)]
    (if (prime? n)
      n
      (recur n))))

  (def primes
    (concat [2 3 5 7]
      (iterate next-prime 11)))
