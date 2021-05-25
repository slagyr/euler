(ns euler.level1.problem007
 (:require [clojure.math.numeric-tower :as math]))

(defn prime? [n]
 (loop [n n
        k 1]
  (if (<= (- (* 6 k) 1) (Math/floor (math/sqrt n)))
   (cond
    (= 0 (mod n (+ 1 (* 6 k)))) false
    (= 0 (mod n (- 1 (* 6 k)))) false
    :default (recur n (inc k))
    )
   (cond
    (<= n 3) true
    (= 0 (mod n 2)) false
    (= 0 (mod n 3)) false
    :default n
    )
   )
  )
 )

(defn euler-7 [n]
 (nth (drop 2(filter prime? (range 1e9))) (dec 10001))
 )
