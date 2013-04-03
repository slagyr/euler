(ns euler.level1.problem004-spec
  (:use
    [speclj.core]
    [euler.level1.problem004]))

(describe "Euler Problem #4"

  (it "knows a palindrome when it sees one"
    (should (palindrome? 1))
    (should (palindrome? 11))
    (should (palindrome? 101))
    (should (palindrome? 232))
    (should (palindrome? 12321))
    (should (palindrome? 9876789))
    (should (palindrome? 654333456))
    (should-not (palindrome? 123))
    (should-not (palindrome? 900109)))

  (it "solves #4"
    (should= 9009 (euler-4 2))
    (should= 906609 (euler-4 3)))

  )

(run-specs)
