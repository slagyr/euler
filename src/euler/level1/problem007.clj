(ns euler.level1.problem007
 (:require [clojure.math.numeric-tower :as math]))

;(defn prime? [n]
; (zero? (count (filter #(true? %) (map #(= 0 (mod n %) ) (range 1 (inc n)))))))

(defn non-divisible? [n div]
 (not (= 0 (mod n div))))

(defn prime? [n]
 (= 0 (count (filter #(false? (non-divisible? n %))  (range 2 (inc (int (Math/sqrt n))))))))

(defn euler-7 [n]
 (nth (filter #(prime? %) (drop 2 (range))) (dec n))
 )
