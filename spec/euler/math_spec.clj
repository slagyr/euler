(ns euler.math-spec
  (:require
    [speclj.core :refer :all]
    [euler.math :refer :all]))

(describe "Math stuff"

  (it "has natural numbers"
    (should= 1 (first (naturals)))
    (should= 2 (second (naturals)))
    (should= 3 (nth (naturals) 2))
    (should= 1000 (nth (naturals) 999)))

  (it "gets naturals upto"
    (should= [1 2 3] (naturals-upto 3))
    (should= [1 2 3 4 5] (naturals-upto 5))
    (should= [1 2 3 4 5 6 7 8 9 10] (naturals-upto 10)))

  (it "find proper divisors"
    (should= [1 2 4 5 10 11 20 22 44 55 110] (proper-divisors 220))
    (should= [1 2 4 71 142] (proper-divisors 284))
    (should= [1 2 4 7 14] (proper-divisors 28))
    (should= [1] (proper-divisors 31))
    (should= [1] (proper-divisors 3))
    (should= [1 2] (proper-divisors 4)))

  (it "knows perfect numbers"
    (should= true (perfect? 28))
    (should= false (perfect? 27))
    (should= false (perfect? 12)))

  (it "knows deficient numbers"
    (should= true (deficient? 27))
    (should= false (deficient? 28))
    (should= false (deficient? 12)))

  (it "knows abundant numbers"
    (should= false (abundant? 27))
    (should= false (abundant? 28))
    (should= true (abundant? 12)))

    (it "calculates fibonacci sequence"
    (should= 0 (nth (fib) 0))
    (should= 1 (nth (fib) 1))
    (should= 1 (nth (fib) 2))
    (should= 2 (nth (fib) 3))
    (should= 3 (nth (fib) 4))
    (should= 5 (nth (fib) 5))
    (should= 8 (nth (fib) 6))
    (should= 13 (nth (fib) 7)))

  (describe "Primes"

    (context "Prime Factors"

      (it "factors 1"
        (should= [] (prime-factors-of 1)))

      (it "factors 2"
        (should= [2] (prime-factors-of 2)))

      (it "factors 3"
        (should= [3] (prime-factors-of 3)))

      (it "factors 4"
        (should= [2 2] (prime-factors-of 4)))

      (it "factors 5"
        (should= [5] (prime-factors-of 5)))

      (it "factors 6"
        (should= [2 3] (prime-factors-of 6)))

      (it "factors 7"
        (should= [7] (prime-factors-of 7)))

      (it "factors 8"
        (should= [2 2 2] (prime-factors-of 8)))

      (it "factors 9"
        (should= [3 3] (prime-factors-of 9)))

;      (it "factors 2^100"
;        (should= (repeat 100 2) (prime-factors-of (Math/pow 2 100))))
      )

    (it "knows if a number is prime"
      (should= false (prime? 1))
      (should= false (prime? 9))
      (should= false (prime? 42))
      (should= true (prime? 2))
      (should= true (prime? 3))
      (should= true (prime? 13))
      (should= true (prime? 97)))

    (it "privides an infinite list of primes"
      (should= 2 (first primes))
      (should= 3 (nth primes 1))
      (should= 5 (nth primes 2))
      (should= 7 (nth primes 3))
      (should= 11 (nth primes 4))
      (should= 13 (nth primes 5))
      (should= 101 (nth primes 25)))

    (it "calculates factorial"
      (should= 24 (factorial 4)))
    )
  )

