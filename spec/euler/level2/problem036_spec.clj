(ns euler.level2.problem036-spec
  (:require
    [speclj.core :refer :all]
    [euler.level2.problem036 :refer :all]))

; https://projecteuler.net/problem=36

(describe "Euler Problem #36"

  (it "->binary"
    (should= "0" (->binary 0))
    (should= "1" (->binary 1))
    (should= "10" (->binary 2))
    (should= "11" (->binary 3))
    (should= "1100011" (->binary 99))
    (should= "1100100" (->binary 100))
    (should= "1100101" (->binary 101)))

  (it "palindrome?"
    (should= true (palindrome? 1))
    (should= true (palindrome? "1"))

    (should= false (palindrome? 10))
    (should= false (palindrome? "10"))

    (should= true (palindrome? 11))
    (should= true (palindrome? "11")))

  (it "decimal-and-binary-palindrome?"
    (should= true (decimal-and-binary-palindrome? 585))
    (should= false (decimal-and-binary-palindrome? 101)))

  (it "Solves #36"
    (should= 157 (euler-36 100))
    #_(should= 872187 (euler-36 1000000)))
  )

(run-specs)
