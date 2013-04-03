(ns euler.level2.problem029)

(defn euler-29 [n]
  (count
    (set
      (apply concat
        (for [a (range 2 (inc n))]
          (for [b (range 2 (inc n))]
            (Math/pow a b)))))))
