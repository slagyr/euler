(ns euler.level1.problem001)

(defn multiple-3-5? [n]
  (cond
    (= (mod n 3) 0) true
    (= (mod n 5) 0) true
    :else false)
  )

(defn euler-1 [n]
  (reduce + (filter multiple-3-5? (range n)))
  )


