(ns euler.problem3-spec
  (:use
    [speclj.core]
    [euler.problem3]))

(describe "Euler Problem #3"

  (it "factors 1"
    (should= [] (factors-of 1)))

  (it "factors 2"
    (should= [2] (factors-of 2)))

  (it "factors 3"
    (should= [3] (factors-of 3)))

  (it "factors 4"
    (should= [2 2] (factors-of 4)))

  (it "factors 5"
    (should= [5] (factors-of 5)))

  (it "factors 6"
    (should= [2 3] (factors-of 6)))

  (it "factors 7"
    (should= [7] (factors-of 7)))

  (it "factors 8"
    (should= [2 2 2] (factors-of 8)))

  (it "factors 9"
    (should= [3 3] (factors-of 9)))

  (it "factors 2^100"
    (should= (repeat 100 2) (factors-of (Math/pow 2 100))))

  (it "solves #3"
    (should= 29 (euler-3 13195))
    (should= 6857 (euler-3 600851475143)))

  )

(run-specs)