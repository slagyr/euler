(ns euler.level1.problem003
  (:use
    [euler.primes]))

(defn euler-3 [n]
  (last (factors-of n)))