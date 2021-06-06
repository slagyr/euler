(ns euler.level1.problem007-spec
 (:require
  [speclj.core :refer :all]
  [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7

(describe "euler 7"

 (it "check if n is not divisble"
  (should (non-divisible? 3 2))
  (should-not (non-divisible? 4 2))
  (should (non-divisible? 4 3))
  )
 (it "checks if n is prime"
       (should (prime? 2))
       (should-not (prime? 4))
       )
 (it "solve euler 7"
       (should= 2 (euler-7 1))
       (should= 5 (euler-7 3))
       (should= 7927 (euler-7 1001))
       (should= 104743 (euler-7 10001))
       )

 )

(run-specs)
