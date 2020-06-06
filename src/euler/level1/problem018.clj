(ns euler.level1.problem018
  (:require
    [euler.io :refer [str->grid]]))

(defn largest-sums-for-row [sums row]
  (let [padded-sums (vec (concat [0] sums [0]))
        start-seqs (partition 2 1 padded-sums)
        sum-seqs (map #(map (partial + %1) %2) row start-seqs)]
    (map #(apply max %) sum-seqs)))

(defn euler-18 [triangle]
  (let [rows (str->grid triangle)
        sums (reduce largest-sums-for-row rows)]
    (apply max sums)))
