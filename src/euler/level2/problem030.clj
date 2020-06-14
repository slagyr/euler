(ns euler.level2.problem030
  (:require
    [euler.core :refer [digits]]))

(defn power-map [n]
  (reduce
    #(assoc %1 %2 (int (Math/pow %2 n)))
    {}
    (range 10)))

(defn sum-of-powers [powers n]
  (apply +
    (map #(get powers %)
      (digits n))))

(defn power-ups [n]
  (let [powers (power-map n)]
    (loop [i 10 results []]
      (if (> i 1000000)
        results
        (let [power-sum (sum-of-powers powers i)]
          (if (= power-sum i)
            (recur (inc i) (conj results i))
            (recur (inc i) results)))))))

(defn euler-30 [n]
  (apply + (power-ups n)))
