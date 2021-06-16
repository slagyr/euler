(ns euler.level1.problem010-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem010 :refer :all]))

; https://projecteuler.net/problem=10

(describe "Euler Problem #10"

  (it "Solves #10"
    (should= -1 (euler-10 -1)))
  )

(run-specs)
