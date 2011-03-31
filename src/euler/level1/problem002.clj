(ns euler.level1.problem002
  (:use
    [euler.math :only (fib)]))

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
