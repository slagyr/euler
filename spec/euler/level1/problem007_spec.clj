(ns euler.level1.problem007-spec
 (:require
  [speclj.core :refer :all]
  [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7

(describe "euler 7"
 (xit (it "gets nth prime"
       (should= 2 (get-nth-prime 1))
       (should= 5 (get-nth-prime 3))
       ))
 (it "checks if n is prime"
  (should (prime? 2))
  (should-not (prime? 4))
  )
 )

(run-specs)
