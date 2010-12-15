(ns euler.euler_test
  (:use
    [speclj.core]
    [euler.euler]))

(describe "Project Euler solutions"

  (it "solves #1"
    (should= 23 (euler-1 10))
    (should= 233168 (euler-1 1000)))

  (it "solves #2"
    (should= 2 (euler-2 5))
    (should= 10 (euler-2 20))
    (should= 44 (euler-2 100))
    (should= 4613732 (euler-2 4000000)))

  (it "solves #3"
    (should= 29 (euler-3 13195))
    (should= 6857 (euler-3 600851475143))))

(describe "Euler #1"

  (it "knows if a number is a multiple of 3 or 5"
    (let [multiple? (multiple-filter 3 5)]
      (should (multiple? 3))
      (should (multiple? 5))
      (should (multiple? 9))
      (should (multiple? 10))
      (should (multiple? 15))
      (should-not (multiple? 1))
      (should-not (multiple? 98))))

  (it "has natural numbers"
    (should= 1 (first (naturals)))
    (should= 2 (second (naturals)))
    (should= 3 (nth (naturals) 2))
    (should= 1000 (nth (naturals) 999)))

  (it "gets naturals upto"
    (should= [1 2] (naturals-upto 3))
    (should= [1 2 3 4] (naturals-upto 5))
    (should= [1 2 3 4 5 6 7 8 9] (naturals-upto 10)))
  )

(describe "Euler #2"

  (it "calculates fibonacci sequence"
    (should= 0 (nth (fib) 0))
    (should= 1 (nth (fib) 1))
    (should= 1 (nth (fib) 2))
    (should= 2 (nth (fib) 3))
    (should= 3 (nth (fib) 4))
    (should= 5 (nth (fib) 5))
    (should= 8 (nth (fib) 6))
    (should= 13 (nth (fib) 7)))

  (it "finds fibs upto"
    (should= [0 1 1 2] (fibs-upto 2))
    (should= [0 1 1 2 3] (fibs-upto 4))
    (should= [0 1 1 2 3 5 8] (fibs-upto 10)))
  )

(describe "prime factors"
  (it "factors 1"
    (should= [] (factors-of 1)))

  (it "factors 2"
    (should= [2] (factors-of 2)))

  (it "factors 3"
    (should= [3] (factors-of 3)))

  (it "factors 4"
    (should= [2 2] (factors-of 4)))

  (it "factors 5"
    (should= [5] (factors-of 5)))

  (it "factors 6"
    (should= [2 3] (factors-of 6)))

  (it "factors 7"
    (should= [7] (factors-of 7)))

  (it "factors 8"
    (should= [2 2 2] (factors-of 8)))

  (it "factors 9"
    (should= [3 3] (factors-of 9)))

  (it "factors 2^100"
    (should= (repeat 100 2) (factors-of (Math/pow 2 100)))))


(run-specs)
