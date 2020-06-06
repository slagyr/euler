(ns euler.level1.problem003
  (:require
    [euler.math :refer [prime-factors-of]]))

(defn euler-3 [n]
  (last (prime-factors-of n)))
