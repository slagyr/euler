(ns euler.level1.problem003-spec
  (:use
    [speclj.core]
    [euler.level1.problem003]))

(describe "Euler Problem #3"

  (it "solves #3"
    (should= 29 (euler-3 13195))
    (should= 6857 (euler-3 600851475143)))

  )

(run-specs)