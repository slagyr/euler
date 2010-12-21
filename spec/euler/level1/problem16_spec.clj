(ns euler.level1.problem16-spec
  (:use
    [speclj.core]
    [euler.level1.problem16]))

(describe "Euler Problem #16"

  (it "Solves #16"
    (should= 2 (euler-16 1))
    (should= 7 (euler-16 4))
    (should= 5 (euler-16 5))
    (should= 10 (euler-16 6))
    (should= 11 (euler-16 7))
    (should= 13 (euler-16 8))
    (should= 1366 (euler-16 1000)))
  )

(run-specs)
