(ns euler.level1.problem010
  (:use
    [euler.primes]))

(defn euler-10 [n]
  (apply +
    (take-while
      #(< % n)
      primes)))
