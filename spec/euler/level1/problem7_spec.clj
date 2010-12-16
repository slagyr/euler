(ns euler.level1.problem7-spec
  (:use
    [speclj.core]
    [euler.level1.problem7]))

(describe "Euler Problem #7"

  (it "Solved #7"
    (should= 13 (euler-7 6))
    (should= 97 (euler-7 25))
    (should= 104743 (euler-7 10001)))
  )

(run-specs)
