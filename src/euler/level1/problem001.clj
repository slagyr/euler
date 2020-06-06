(ns euler.level1.problem001
  (:require
    [euler.math :refer [naturals-upto]]))

(defn multiple-filter [& factors]
  (fn [n]
    (some #(= 0 (rem n %)) factors)))

(defn euler-1 [n]
  (let [multiple-of-3-or-5? (multiple-filter 3 5)]
    (apply +
           (filter multiple-of-3-or-5? (naturals-upto (dec n))))))
