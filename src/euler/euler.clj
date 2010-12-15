(ns euler.euler)

(defn multiple? [n]
  (or
    (= 0 (rem n 3))
    (= 0 (rem n 5))))

(def naturals (fn [] (iterate inc 1)))

(defn naturals-upto [n]
  (take (dec n) (naturals)))

(defn euler-1 [n]
  (apply +
    (filter multiple? (naturals-upto n))))
