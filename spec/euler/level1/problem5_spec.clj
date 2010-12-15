(ns euler.level1.problem5-spec
  (:use
    [speclj.core]
    [euler.level1.problem5]))

(describe "Euler Problem #5"

  (it "solves #5"
    (should= 2520 (euler-5 10))
    (should= 232792560 (euler-5 20)))
  )


(run-specs)
