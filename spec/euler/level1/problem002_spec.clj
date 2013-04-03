(ns euler.level1.problem002-spec
  (:use
    [speclj.core]
    [euler.level1.problem002]))

(describe "Euler Problem #2"

  (it "finds fibs upto"
    (should= [0 1 1 2] (fibs-upto 2))
    (should= [0 1 1 2 3] (fibs-upto 4))
    (should= [0 1 1 2 3 5 8] (fibs-upto 10)))

  (it "solves #2"
    (should= 2 (euler-2 5))
    (should= 10 (euler-2 20))
    (should= 44 (euler-2 100))
    (should= 4613732 (euler-2 4000000)))
  )

(run-specs)