(ns euler.level1.problem010
  (:require
    [euler.math :refer [primes]]))

(defn euler-10 [n]
  (apply +
    (take-while
      #(< % n)
      primes)))
