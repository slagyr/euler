(ns euler.level1.problem024
  (:require
    [clojure.math.combinatorics :refer [permutations]]))

(defn euler-24 [seq position]
  (last (take position (permutations seq)))
  )
