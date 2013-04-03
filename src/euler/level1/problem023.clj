(ns euler.level1.problem023
  (:use
    [euler.math :only (naturals-upto abundant?)]))

(defn abundant-numbers-upto [max]
  (filter abundant? (naturals-upto max)))

(defn sum-of-pair-in? [additives additive-set n]
  (loop [additives additives]
    (let [additive (first additives)]
      (cond
        (nil? additive) false
        (> additive n) false
        (contains? additive-set (- n additive)) true
        :else (recur (rest additives))))))

(defn non-abundant-sums-upto [n]
  (let [additives (abundant-numbers-upto n)
        additive-set (set additives)]
    (filter
      (fn [candidate] (not (sum-of-pair-in? additives additive-set candidate)))
      (naturals-upto n))))

(defn euler-23 [n]
  (apply + (non-abundant-sums-upto n)))
