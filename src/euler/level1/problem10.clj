(ns euler.level1.problem10
  (:use
    [euler.primes]))

(defn euler-10 [n]
  (apply +
    (take-while
      #(< % n)
      primes)))
