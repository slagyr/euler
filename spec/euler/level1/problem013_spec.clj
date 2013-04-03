(ns euler.level1.problem013-spec
  (:use
    [speclj.core]
    [euler.level1.problem013]))

(describe "Euler Problem #13"

  (it "Solves #13"
    (should= "5537376230" (euler-13)))
  )

(run-specs)
