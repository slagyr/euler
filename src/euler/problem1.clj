(ns euler.problem1)

(defn multiple-filter [& factors]
  (fn [n]
    (some #(= 0 (rem n %)) factors)))

(def naturals (fn [] (iterate inc 1)))

(defn naturals-upto [n]
  (take (dec n) (naturals)))

(defn euler-1 [n]
  (let [multiple-of-3-or-5? (multiple-filter 3 5)]
    (apply +
      (filter multiple-of-3-or-5? (naturals-upto n)))))
