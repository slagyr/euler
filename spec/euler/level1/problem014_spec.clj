(ns euler.level1.problem014-spec
  (:use
    [speclj.core]
    [euler.level1.problem014]))

(describe "Euler Problem #14"

  (it "compute collatz seq"
    (should= [13 40 20 10 5 16 8 4 2 1] (collatz 13)))

  (it "Solves #14"
    (should= 9 (euler-14 14))
;    (should= 837799 (euler-14 1000000))
    )
  )

(run-specs)
