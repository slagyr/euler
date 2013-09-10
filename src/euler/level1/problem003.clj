(ns euler.level1.problem003)

(defn euler-3 [n]
  (loop [i 2
         x n]
    (cond
      (= i x) i
      (= 0 (mod x i)) (recur (dec i) (/ x i))
      :else (recur (inc i) x)
      )))




