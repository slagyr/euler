(ns euler.level2.problem034-spec
  (:require
    [speclj.core :refer :all]
    [euler.level2.problem034 :refer :all]))

; https://projecteuler.net/problem=34

(describe "Euler Problem #34"

  (it "sum-of-factorials"
    (should= 1 (sum-of-factorial-of-digits 1))
    (should= 2 (sum-of-factorial-of-digits 2))
    (should= 2 (sum-of-factorial-of-digits 11))
    (should= 3 (sum-of-factorial-of-digits 12))
    (should= 7 (sum-of-factorial-of-digits 13))
    (should= 25 (sum-of-factorial-of-digits 14))
    (should= 145 (sum-of-factorial-of-digits 145)))

  (it "=sum-of-factorials?"
    (should= true (=sum-of-factorials 145))
    (should= false (=sum-of-factorials 146)))

  (it "Solves #34"
    (should= 40730 (euler-34 -1)))
  )

(run-specs)
