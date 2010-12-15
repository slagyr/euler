(ns euler.problem3)

(defn factors-of [n]
  (loop [factors [] divisor 2 n n]
    (if (<= n 1)
      factors
      (if (= 0 (mod n divisor))
        (recur (conj factors divisor) divisor (/ n divisor))
        (recur factors (inc divisor) n)))))

(defn euler-3 [n]
  (last (factors-of n)))