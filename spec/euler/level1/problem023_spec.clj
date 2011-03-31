(ns euler.level1.problem023-spec
  (:use
    [speclj.core]
    [euler.level1.problem023]
    [euler.math :only (abundant?)]))


;A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the
; sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
;
;A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.
;
;As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of
; two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be
; written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even
; though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than
; this limit.
;
;Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.


(describe "Euler Problem #23"

  (it "finds abundant numbers"
    (should= [] (abundant-numbers-upto 10))
    (should= [12] (abundant-numbers-upto 12))
    (doseq [n (abundant-numbers-upto 200)]
      (should= true (abundant? n))))

  (it "knows if a number is the sum of 2 abundant numbers"
    (let [additives (abundant-numbers-upto 40)
          additive-set (set additives)]
      (should-not (sum-of-pair-in? additives additive-set 1))
      (should-not (sum-of-pair-in? additives additive-set 12))
      (should-not (sum-of-pair-in? additives additive-set 18))
      (should-not (sum-of-pair-in? additives additive-set 20))
      (should-not (sum-of-pair-in? additives additive-set 100))
      (should (sum-of-pair-in? additives additive-set 30))
      (should (sum-of-pair-in? additives additive-set 32))
      (should (sum-of-pair-in? additives additive-set 36))
      (should (sum-of-pair-in? additives additive-set 38))
      (should (sum-of-pair-in? additives additive-set 40))))

  (it "find non-abundant-sums"
    (should=
      [1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 25 26 27 28 29 31 33 34 35 37 39]
      (non-abundant-sums-upto 40)))


  (it "Solves #23"
    (should= 620 (euler-23 40))
;    (should= 4179871 (euler-23 28123))
    )
  )

(run-specs)
