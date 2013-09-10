(ns euler.level1.problem002-spec
  (:use
    [speclj.core]
    [euler.level1.problem002]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #2"

  (it "Solves #2"
    (should= 10 (euler-2 10))
	(should= 4613732 (euler-2 4000000)))
  )

(run-specs)
