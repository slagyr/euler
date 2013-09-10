(ns euler.level1.problem001)

(defn euler-1 [n]
  (loop [i (- n 1)
         sum 0]
    (cond
      (= i 0) sum
      (or (= (mod i 5) 0)
          (= (mod i 3) 0)) (recur (dec i) (+ sum i))
      :else (recur (dec i) sum)))


  )
