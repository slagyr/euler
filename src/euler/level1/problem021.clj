(ns euler.level1.problem021
  (:require
    [euler.math :refer [proper-divisors]]))

(defn d [n]
  (apply + (proper-divisors n)))

(defn d-map [n]
  (reduce #(assoc %1 %2 (d %2)) {} (range 1 (inc n))))

(defn amicable-pairs [n]
  (let [n->d (d-map n)
        amicable? (fn [[n d]] (and (not (= n d)) (= n (get n->d d))))]
    (filter amicable? n->d)))

(defn euler-21 [n]
  (let [amicable-pairs (amicable-pairs n)]
    (apply + (set (flatten amicable-pairs)))))


