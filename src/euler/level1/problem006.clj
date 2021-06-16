(ns euler.level1.problem006)

(defn get-sum-squares [n]
   (reduce + (map #(* % %) (range 1 (inc n)))))

(defn get-square-sum [n]
  (let [total (/ (* n (+ n 1)) 2) sum (* total total) ] sum))

(defn euler-6 [n]
  (- (get-square-sum n) (get-sum-squares n))
  )