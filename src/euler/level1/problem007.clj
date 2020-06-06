(ns euler.level1.problem007
  (:require
    [euler.math :refer [primes]]))

(defn euler-7 [n]
  (nth primes (dec n)))
