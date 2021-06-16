(ns euler.level1.problem005)

(defn divisible [a b]
  (mod a b))

;;(defn multiples [n]
;;  (for [multipliers (vec (range 1 20))]
;;    [n multipliers])
;;  )
;;
;;(defn get-multiples [n]
;;  (sort(set (map #(reduce * %) (multiples n)))))

(defn is-evenly-divisible? [n]
  (not(zero? (reduce + (map (partial divisible n) (range 1 21))))))

(defn find-min [multiple r]
  (first (drop-while #(is-evenly-divisible? %) (drop 1 (range 0 1e9 multiple)))))
;;(defn test-m [n r]
;;  (not= 0 (reduce + (map #(rem n %) (range 1 (inc r))))))
;;
;;(defn find-m [multiple r]
;;  (first (drop-while #(test-m % r) (drop 1 (range 0 1e9 multiple)))))


(defn euler-5 [n]
  (find-min 2520 20)
  )
