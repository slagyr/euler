(ns euler.level1.problem004-spec
  (:use
    [speclj.core]
    [euler.level1.problem004]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #4"

  (it "finds palindrome"
    (should= true (is-palindrome 9009))
    (should= true (is-palindrome 818))
    )


  (it "Solves #4"
    (should= 9009 (euler-4 99))
    (should= 906609 (euler-4 999))
    ))

(run-specs)
