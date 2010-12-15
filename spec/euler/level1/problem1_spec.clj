(ns euler.level1.problem1_spec
  (:use
    [speclj.core]
    [euler.level1.problem1]))

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

  (it "solves #1"
    (should= 23 (euler-1 10))
    (should= 233168 (euler-1 1000)))

  )

(run-specs)
