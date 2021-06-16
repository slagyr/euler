(ns euler.level1.problem006-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem006 :refer :all]))

; https://projecteuler.net/problem=6

(describe "Euler Problem #6"

  (it "Gets sum of the squares of the first n numbers"
    (should= 385 (get-sum-squares 10))
    )
  (it "Gets square of the sum of the first n numbers"
    (should= 3025 (get-square-sum 10))
    )
  (it "Solves #6"
    (should= 25164150 (euler-6 100)))
  )

(run-specs)
