(ns euler.euler)

(defn multiple-filter [& factors]
  (fn [n]
    (some #(= 0 (rem n %)) factors)))

(def naturals (fn [] (iterate inc 1)))

(defn naturals-upto [n]
  (take (dec n) (naturals)))

(defn euler-1 [n]
  (let [multiple-of-3-or-5? (multiple-filter 3 5)]
    (apply +
      (filter multiple-of-3-or-5? (naturals-upto n)))))

(defn fib []
  (map first
    (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

(defn fibs-upto
  ([n] (fibs-upto n (fib)))
  ([n fibs]
    (lazy-seq
      (let [next-fib (first fibs)]
        (if (> next-fib n)
          nil
          (cons next-fib (fibs-upto n (rest fibs))))))))

(defn euler-2 [n]
  (apply +
    (filter even? (fibs-upto n))))

(defn factors-of [n]
  (loop [factors [] divisor 2 n n]
    (if (<= n 1)
      factors
      (if (= 0 (mod n divisor))
        (recur (conj factors divisor) divisor (/ n divisor))
        (recur factors (inc divisor) n)))))

(defn euler-3 [n]
  (last (factors-of n)))