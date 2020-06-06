(ns euler.level1.problem012-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem012 :refer :all]))

(describe "Euler Problem #12"

  (it "calculates triangle sequence"
    (should= [1 3 6 10 15 21 28 36 45 55] (take 10 (triangle-numbers))))

  (it "finds divisors"
    (should= [1] (sort (divisors-of 1)))
    (should= [1 3] (sort (divisors-of 3)))
    (should= [1 2 3 6] (sort (divisors-of 6)))
    (should= [1 2 5 10] (sort (divisors-of 10)))
    (should= [1 3 5 15] (sort (divisors-of 15)))
    (should= [1 3 7 21] (sort (divisors-of 21)))
    (should= [1 2 4 7 14 28] (sort (divisors-of 28))))

  (it "Solves #12"
    (should= 28 (euler-12 5))
;    (should= 76576500 (euler-12 500))
    )
  )

(run-specs)
