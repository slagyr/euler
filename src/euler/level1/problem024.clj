(ns euler.level1.problem024
  (:use
    [clojure.contrib.combinatorics :only (lex-permutations)]))

(defn euler-24 [seq position]
  (last (take position (lex-permutations seq))))
