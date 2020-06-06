(ns euler.level2.problem027
  (:require
    [euler.math :refer [prime? primes]]))

(defn quadratic-fn [a b]
  (fn [n]
    (+
      (* n n)
      (* n a)
      b)))

(defn consecutive-primes [qf]
  (count
    (take-while prime?
      (map qf (iterate inc 0)))))

(defn euler-27 [n]
  (let [all-as (range (* -1 n) n)
        bs (take-while #(< % n) primes)]
    (loop [max-primes 0 max-coefs nil as all-as bs bs]
      (if (empty? bs)
        (do
;          (println "max-coefs: " max-coefs)
;          (println "max-primes: " max-primes)
          (apply * max-coefs))
        (if (empty? as)
          (recur max-primes max-coefs all-as (rest bs))
          (let [a (first as)
                b (first bs)
                qf (quadratic-fn a b)
                prime-count (consecutive-primes qf)]
            (if (> prime-count max-primes)
              (recur prime-count [a b] (rest as) bs)
              (recur max-primes max-coefs (rest as) bs))))))))

