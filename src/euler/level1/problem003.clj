(ns euler.level1.problem003
  (:use
    [euler.math :only (prime-factors-of)]))

(defn euler-3 [n]
  (last (prime-factors-of n)))