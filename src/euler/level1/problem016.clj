(ns euler.level1.problem016)

(defn pow [n e]
  (loop [result (bigint n) e (dec e)]
    (if (<= e 0)
      result
      (recur (* result n) (dec e)))))

(defn euler-16 [n]
  (let [result (pow 2 n)
        digits (map #(Integer/parseInt (str %)) (seq (str result)))]
    (apply + digits)))
