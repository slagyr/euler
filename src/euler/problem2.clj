(ns euler.problem2)

(defn fib []
  (map first
    (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

(defn fibs-upto
  ([n] (fibs-upto n (fib)))
  ([n fibs]
    (lazy-seq
      (let [next-fib (first fibs)]
        (if (> next-fib n)
          nil
          (cons next-fib (fibs-upto n (rest fibs))))))))

(defn euler-2 [n]
  (apply +
    (filter even? (fibs-upto n))))
