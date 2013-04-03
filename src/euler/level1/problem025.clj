(ns euler.level1.problem025
  (:use
    [euler.math :only (naturals fib)]))

(defn min-value-with-digits [n]
  (if (= 1 n)
    0
    (apply * (take (dec n) (repeat 10)))))

(defn euler-25 [n]
  (let [min (min-value-with-digits n)
        fib-with-position (partition 2 (interleave (fib) (naturals)))]
    (second
      (last
        (take-while
          (fn [[f p]] (< f min))
          fib-with-position)))))
