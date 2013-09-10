(ns euler.level1.problem005-spec
  (:use
    [speclj.core]
    [euler.level1.problem005]))

; http://projecteuler.net/index.php?section=problems&id=5

(describe "Euler Problem #5"

  (it "Solves #5"
    (should= 2520 (euler-5 10))
    (should= -1 (euler-5 20))
    ))

(run-specs)
