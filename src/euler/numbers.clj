(ns euler.numbers)

(def naturals (fn [] (iterate inc 1)))

(defn naturals-upto [n]
  (take (dec n) (naturals)))

(defn sq [n]
  (* n n))
