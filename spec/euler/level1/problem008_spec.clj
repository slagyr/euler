(ns euler.level1.problem008-spec
  (:use
    [speclj.core]
    [euler.level1.problem008]))

(describe "Euler Problem #8"

  (it "identifies each set of 5 digits"
    (should= [7 3 1 6 7] (first (quintets)))
    (should= [3 1 6 7 1] (second (quintets)))
    (should= [6 3 4 5 0] (last (quintets))))

  (it "solves #8"
    (should= 40824 (euler-8)))
  )

(run-specs)

