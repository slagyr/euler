(ns euler.level1.problem006-spec
  (:use
    [speclj.core]
    [euler.level1.problem006]))

(describe "Euler Problem #6"

  (it "Solves #6"
    (should= 2640 (euler-6 10))
    (should= 25164150 (euler-6 100)))

  )

(run-specs)
