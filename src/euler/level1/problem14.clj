(ns euler.level1.problem14)

(defn- next-collatz [n]
  (cond
    (= 1 n) nil
    (even? n) (/ n 2)
    :else (+ 1 (* 3 n))))

(defn collatz [n]
  (take-while identity (iterate next-collatz n)))

(defn euler-14 [n]
  (let [pairs (pmap (fn [x] [x (count (collatz x))]) (range 1 n))]
    (first
      (reduce
        (fn [[winner w-length] [contender c-length]]
          (if (> c-length w-length)
            [contender c-length]
            [winner w-length]))
        pairs))))
