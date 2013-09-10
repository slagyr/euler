(ns euler.level1.problem002)

(defn euler-2 [k]
  (loop [i 0
         n 0
         m 1
         sum 0]
    (cond
      (> (+ n m) k) sum
      (= 0 (mod (+ n m) 2)) (recur (inc i) m (+ n m) (+ sum m n))
      :else (recur (inc i) m (+ n m) sum)))


  )
