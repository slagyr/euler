(ns euler.level2.problem033-spec
    (:require
      [speclj.core :refer :all]
      [euler.level2.problem033 :refer :all]))

  ; https://projecteuler.net/problem=33

  (describe "Euler Problem #33"

    (it "2 digit fractions less than 1"
      (let [fractions (fraction-candidates)]
        (should= [10 11] (first fractions))
        (should= [10 12] (second fractions))
        (should= [10 13] (nth fractions 2))
        (should= [11 12] (nth fractions 89))))

    (it "cancellations"
      (let [results (cancellation [12 24])]
        (should= [1 4] results)))

    (it "cancellations - no zero denominators"
      (let [results (cancellation [12 20])]
        (should= nil results)))

    (it "cancellations - less than one"
      (let [results (cancellation [45 54])]
        (should= nil results)))

    (it "all examples"
      (let [examples (find-examples)]
        (should-contain [[49 98] [4 8]] examples)
        (should-contain [[20 30] [2 3]] examples)))

    (it "non-trivial examples"
      (let [examples (find-non-trivial-examples)]
        (should-contain [[49 98] [4 8]] examples)
        (should-not-contain [[20 30] [2 3]] examples)
        (should-not-contain [[11 22] [1 2]] examples)))

    (it "Solves #33"
      (should= 1/100 (euler-33 -1)))
    )

  (run-specs)
