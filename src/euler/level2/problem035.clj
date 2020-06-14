(ns euler.level2.problem035
  (:require [euler.core :as core]
            [euler.math :as emath]))

(defn rotate [digits i]
  (let [tail (take i digits)
        head (drop i digits)]
    (concat head tail)))

(defn rotations [n]
  (let [digits (core/digits n)]
    (->> (range (count digits))
         (map (partial rotate digits))
         ;core/->inspect
         (map #(core/s->i (apply str %)))
         ;core/->inspect
         set)))

(defn circular? [primes n]
  (every? #(contains? primes %) (rotations n)))

(defn euler-35 [n]
  (let [primes (set (emath/primes< n))]
    (count (filter (partial circular? primes) primes))))

