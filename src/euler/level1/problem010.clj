(ns euler.level1.problem010
  (:use
    [euler.math :only (primes)]))

(defn euler-10 [n]
  (apply +
    (take-while
      #(< % n)
      primes)))
