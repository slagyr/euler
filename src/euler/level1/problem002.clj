(ns euler.level1.problem002)



(defn get-next-fib-term [n]
  (if (< n 4)
    n
    (+ (get-next-fib-term (- n 1)) (get-next-fib-term (- n 2)))
    ))

(defn get-fib-seq [n]
  (map get-next-fib-term (range 1 (+ n 1)))
  )

(defn is-even? [n]
  (if(= (mod n 2) 0)
    true
    false)
  )

(defn euler-2 [n]
  (reduce + (filter is-even? (get-fib-seq n)))
  )
