(ns euler.level1.problem003)

(defn find-factor [n]
  (->> (range 2 (inc n))
       (drop-while #(not(= 0 (mod n %))))
       (first)))

(defn get-max [factors]
  (->> (clojure.set/difference factors #{nil} )
       (apply max)))

(defn factorialize [n]
  (loop [n n
         factors #{}]
    (if (nil? n)
      factors
      (let [next (find-factor n)
            quotient (if (nil? next) nil (/ n next))]
      (recur quotient (conj factors next))))))

(defn euler-3 [n]
  (->> (factorialize n)
       (get-max)))
