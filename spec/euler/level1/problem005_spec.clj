(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

(describe "Euler Problem #5"

  (it "solves #5"
    (should= 2520 (euler-5 10))
;    (should= 232792560 (euler-5 20))
    )
  )


(run-specs)
