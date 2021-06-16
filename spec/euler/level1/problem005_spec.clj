(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

(describe "Euler Problem #5"

  (it "Solves #5"
    (should= -1 (euler-5 -1)))
  )

(run-specs)
