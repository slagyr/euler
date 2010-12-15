(ns euler.problem1_spec
  (:use
    [speclj.core]
    [euler.problem1]))

(describe "Naturals and multiples"

  (it "knows if a number is a multiple of 3 or 5"
    (let [multiple? (multiple-filter 3 5)]
      (should (multiple? 3))
      (should (multiple? 5))
      (should (multiple? 9))
      (should (multiple? 10))
      (should (multiple? 15))
      (should-not (multiple? 1))
      (should-not (multiple? 98))))

  (it "has natural numbers"
    (should= 1 (first (naturals)))
    (should= 2 (second (naturals)))
    (should= 3 (nth (naturals) 2))
    (should= 1000 (nth (naturals) 999)))

  (it "gets naturals upto"
    (should= [1 2] (naturals-upto 3))
    (should= [1 2 3 4] (naturals-upto 5))
    (should= [1 2 3 4 5 6 7 8 9] (naturals-upto 10)))

  (it "solves #1"
    (should= 23 (euler-1 10))
    (should= 233168 (euler-1 1000)))

  )

(run-specs)
