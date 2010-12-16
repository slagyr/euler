(ns euler.level1.problem3
  (:use
    [euler.primes]))

(defn euler-3 [n]
  (last (factors-of n)))