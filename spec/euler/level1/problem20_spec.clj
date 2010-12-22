(ns euler.level1.problem20-spec
  (:use
    [speclj.core]
    [euler.level1.problem20]))

;n! means n  (n  1)  ...  3  2  1
;
;Find the sum of the digits in the number 100!

(describe "Euler Problem #20"

  (it "Solves #20"
    (should= -1 (euler-20 -1)))
  )

(run-specs)
