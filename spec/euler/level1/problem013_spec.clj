(ns euler.level1.problem013-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem013 :refer :all]))

(describe "Euler Problem #13"

  (it "Solves #13"
    (should= "5537376230" (euler-13)))
  )

(run-specs)
