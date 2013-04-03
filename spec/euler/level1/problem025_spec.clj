(ns euler.level1.problem025-spec
  (:use
    [speclj.core]
    [euler.level1.problem025]))

;The Fibonacci sequence is defined by the recurrence relation:
;
;Fn = Fn1 + Fn2, where F1 = 1 and F2 = 1.
;Hence the first 12 terms will be:
;
;F1 = 1
;F2 = 1
;F3 = 2
;F4 = 3
;F5 = 5
;F6 = 8
;F7 = 13
;F8 = 21
;F9 = 34
;F10 = 55
;F11 = 89
;F12 = 144
;The 12th term, F12, is the first term to contain three digits.
;
;What is the first term in the Fibonacci sequence to contain 1000 digits?

(describe "Euler Problem #25"

  (it "calculated min value for digits"
    (should= 0 (min-value-with-digits 1))
    (should= 10 (min-value-with-digits 2))
    (should= 100 (min-value-with-digits 3))
    (should= 1000 (min-value-with-digits 4))
    (should= 10000 (min-value-with-digits 5)))

  (it "Solves #25"
    (should= 12 (euler-25 3))
;    (should= 4782 (euler-25 1000))
    )
  )

(run-specs)
