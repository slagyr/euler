(ns euler.level2.problem030-spec
  (:require
    [speclj.core :refer :all]
    [euler.level2.problem030 :refer :all]))

;Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
;
;1634 = 14 + 64 + 34 + 44
;8208 = 84 + 24 + 04 + 84
;9474 = 94 + 44 + 74 + 44
;As 1 = 14 is not a sum it is not included.
;
;The sum of these numbers is 1634 + 8208 + 9474 = 19316.
;
;Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.

(describe "Euler Problem #30"

   (it "calculated power map"
     (should= 0 (get (power-map 4) 0))
     (should= 1 (get (power-map 4) 1))
     (should= 16 (get (power-map 4) 2))
     (should= 81 (get (power-map 4) 3))
     (should= 256 (get (power-map 4) 4))
     (should= 6561 (get (power-map 4) 9)))

  (it "calculated the sum of powers"
    (let [powers (power-map 4)]
      (should= 1634 (sum-of-powers powers 1634))
      (should= 8208 (sum-of-powers powers 8208))
      (should= 9474 (sum-of-powers powers 9474))))

;  (it "calculated all the 'power-ups'"
;    (should= [1634 8208 9474] (power-ups 4)))
;
;  (it "Solves #30"
;    (should= 19316 (euler-30 4))
;    (should= 248860 (euler-30 5)))
  )

(run-specs)
