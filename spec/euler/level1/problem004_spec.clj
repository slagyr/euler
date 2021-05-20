(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4

(describe "Euler Problem #4"

  (it "Solves #4"
    (should= -1 (euler-4 -1)))
  )

(run-specs)
