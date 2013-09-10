(ns euler.level1.problem004)

(defn is-palindrome [x]
  (= (str x) (apply str(reverse (str x))))
  )



(defn euler-4 [n]
  (loop [i n
         j n
         best 0]
    (cond
      (= i 0) best
      (= j 0) (recur (dec i) n best)
      (and (= true (is-palindrome (* i j))) (> (* i j) best))
      (recur i (dec j) (* i j))
      :else (recur i (dec j) best)
      )))




