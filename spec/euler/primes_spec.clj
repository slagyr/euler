(ns euler.primes-spec
  (:use
    [speclj.core]
    [euler.primes]))

(describe "Primes"

  (context "Prime Factors"

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
      (should= (repeat 100 2) (factors-of (Math/pow 2 100))))
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
  )
