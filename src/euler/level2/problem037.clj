(ns euler.level2.problem037
  (:require
    [clojure.math.combinatorics :refer [combinations]]
    [euler.core :as core]
    [euler.math :as math]))

(def small-primes [2 3 5 7])

(defn candidates []
  (let [items (mapcat #(take 4 (repeat %)) small-primes)]
    (map core/digits->n (combinations items 4))))

(defn left-truncations [n]
  (loop [digits (rest (core/digits n)) result ()]
    (if (seq digits)
      (recur (rest digits) (cons (core/digits->n digits) result))
      (reverse result))))

(defn right-truncations [n]
  (loop [digits (rest (reverse (core/digits n))) result ()]
    (if (seq digits)
      (recur (rest digits) (cons (core/digits->n (reverse digits)) result))
      (reverse result))))

(defn truncatable-prime? [n]
  (and (math/prime? n)
       (every? math/prime? (left-truncations n))
       (every? math/prime? (right-truncations n))))

(defn truncatable-primes [max]
  (let [samples (range 11 max)]
    (filter truncatable-prime? samples)))

(defn euler-37 [max]
  (apply + (truncatable-primes max)))
