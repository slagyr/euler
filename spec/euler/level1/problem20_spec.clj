(ns euler.level1.problem20-spec
  (:use
    [speclj.core]
    [euler.level1.problem20]))

;n! means n  (n  1)  ...  3  2  1
;
;Find the sum of the digits in the number 100!

(describe "Euler Problem #20"

  (it "Solves #20"
    (should= 1 (euler-20 1))
    (should= 2 (euler-20 2))
    (should= 6 (euler-20 3))
    (should= 6 (euler-20 4))
    (should= 648 (euler-20 100))
    (should= 10539 (euler-20 1000))
    (should= 149346 (euler-20 10000)))

  (it "calculates factorial"
    (should= 24 (factorial 4)))

  (it "sums the digits"
    (should= 1 (sum-of-digits 1))
    (should= 2 (sum-of-digits 2))
    (should= 2 (sum-of-digits 11))
    (should= 3 (sum-of-digits 111))
    (should= 15 (sum-of-digits 12345)))

  (it "gets the digits"
    (should= [1] (digits 1))
    (should= [1 0] (digits 10))
    (should= [1 0 4 2] (digits 1042)))
  )

(run-specs)



