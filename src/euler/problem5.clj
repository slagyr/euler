(ns euler.problem5)

; Need to improve performance on this one.
; Find all the primes less than n and start with the product of them
(defn euler-5 [n]
  (let [nums (range 1 (inc n))
        max (apply * nums)
        matcher (fn [x] (not (some #(not (= 0 (rem x %))) (reverse nums))))]
    (first (filter matcher (iterate #(+ % n) (* n (dec n)))))))
