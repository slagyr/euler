(ns euler.level1.problem010-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem010 :refer :all]))

(describe "Euler Problem #10"

  (it "Solves #10"
    (should= 17 (euler-10 10))
;    (should= 142913828922 (euler-10 2000000))
  )
  )

(run-specs)
