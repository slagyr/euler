(ns euler.level1.problem006
  (:require
    [euler.math :refer [naturals]]))

(defn euler-6 [n]
  (let [nums (take n (naturals))
        squares (map #(* % %) nums)
        sum-of-squares (apply + squares)
        sum (apply + nums)
        square-of-sums (* sum sum)]
    (- square-of-sums sum-of-squares)))
