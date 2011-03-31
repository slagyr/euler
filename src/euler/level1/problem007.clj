(ns euler.level1.problem007
  (:use
    [euler.math :only (primes)]))

(defn euler-7 [n]
  (nth primes (dec n)))
