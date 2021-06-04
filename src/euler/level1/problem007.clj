(ns euler.level1.problem007
 (:require [clojure.math.numeric-tower :as math]))

(defn prime? [n]
 (zero? (count (filter #(true? %) (map (= 0 (mod n %) ) (range 1 (inc n)))))))

(defn get-nth-prime [n]
 2)

(defn euler-7 [n]

 )
