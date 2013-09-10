(ns euler.level1.problem005)


(defn is-multiple [n m]
  (loop [x n
         y m
         i 1]
    (cond
      (> i y) true
      (= 0 (mod x i)) (recur x y (inc i))
      :else false)))


(defn euler-5 [n]
  (loop [i 1 x n]
    (cond
      (= true (is-multiple i n)) i
      :else (recur (inc i) x)
      ))
  )







