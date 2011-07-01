(ns euler.level2.problem031)

(def denominations [200 100 50 20 10 5 2 1])

(defn value-of [coins]
  (apply + (map * coins denominations)))

(defn euler-31 []
  (loop [ways 0 coins [0 0 0 0 0 0 0 0] i 0]
    (if (and (< i 7) (= 0 (get coins i)))
      (recur ways coins (inc i))
      (let [value (value-of coins)]
        (cond
          (= value 200) (if (= 0 i) (inc ways) (recur (inc ways) (assoc coins i 0 (dec i) (inc (get coins (dec i)))) (dec i)))
          (> value 200) (if (= 0 i) ways (recur ways (assoc coins i 0 (dec i) (inc (get coins (dec i)))) (dec i)))
          (< value 200)
          (if (< i 7)
            (recur ways coins (inc i))
            (recur ways (assoc coins i (inc (get coins i))) i)))))))
