(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7

(describe "Euler Problem #7"
  (it "Checks if number is prime"
    (should= false (prime? 6))
    (should= true (prime? 2))
    (should= true (prime? 3))
    (should= false (prime? 192))
    (should= 29 (prime? 29))
    (should= true (prime? 1)) ;;1 is not prime...
    )

  (it "Solves #7"
    (should= 104743 (euler-7 -1))
     )
  )

(run-specs)
