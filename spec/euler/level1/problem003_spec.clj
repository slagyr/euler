(ns euler.level1.problem003-spec
  (:use
    [speclj.core]
    [euler.level1.problem003]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #3"

  (it "Solves #3"
    (should= 29 (euler-3 13195))
   (should= 6857 (euler-3 600851475143))))

(run-specs)
