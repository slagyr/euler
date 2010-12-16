(ns euler.level1.problem7
  (:use
    [euler.primes]))

(defn euler-7 [n]
  (nth primes (dec n)))
