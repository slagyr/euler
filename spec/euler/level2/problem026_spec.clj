(ns euler.level2.problem026-spec
  (:use
    [speclj.core]
    [euler.level2.problem026]))

; http://projecteuler.net/index.php?section=problems&id=26

(describe "Euler Problem #26"

  (it "Solves #26"
    (should= -1 (euler-26 -1)))
  )

(run-specs)
