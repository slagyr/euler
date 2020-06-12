(ns euler.level1.problem020
  (:require [euler.math :as emath]))

;(defn factorial [n]
;  (reduce * (range 1 (inc n))))

(defn- get-int [n]
  (- (int n) (int \0)))

(defn digits [n]
  (map get-int (str n)))

(defn sum-of-digits [n]
  (apply + (digits n)))

(defn euler-20 [n]
  (sum-of-digits (emath/factorial n)))


