(ns euler.level2.problem026-spec
  (:use
    [speclj.core]
    [euler.level2.problem026]))

;A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators
; 2 to 10 are given:
;
;1/2	= 	0.5
;1/3	= 	0.(3)
;1/4	= 	0.25
;1/5	= 	0.2
;1/6	= 	0.1(6)
;1/7	= 	0.(142857)
;1/8	= 	0.125
;1/9	= 	0.(1)
;1/10	= 	0.1
;Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.
;
;Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.

(describe "Euler Problem #26"

  (it "calculates unit decimal"
    (should= [5] (unit-decimal 2))
    (should= [2 5] (unit-decimal 4))
    (should= [2] (unit-decimal 5))
    (should= [3 3 3 3 3] (take 5 (unit-decimal 3)))
    (should= [1 6 6 6 6] (take 5 (unit-decimal 6)))
    (should= [1 4 2 8 5 7] (take 6 (unit-decimal 7))))

  (it "knows if a sequence starts with another sequence"
    (should= true (starts-with? [] []))
    (should= true (starts-with? [1] [1]))
    (should= true (starts-with? [1 2] [1]))
    (should= false (starts-with? [1] [1 2]))
    (should= true (starts-with? [1 2 3 4] [1 2])))

  (it "creates subpatterns"
    (should= [[1]] (subpatterns [1]))
    (should= [[1 2] [2]] (subpatterns [1 2]))
    (should= [[1 2 3] [2 3] [3]] (subpatterns [1 2 3])))

  (it "can find a repeating pattern"
    (should= [] (find-cycle []))
    (should= [] (find-cycle [1 2 3 4 5]))
    (should= [1] (find-cycle [1 1 1 1 1]))
    (should= [1 2] (find-cycle [1 2 1 2 1 2 1 2 1 2]))
    (should= [1 4 2 8 5 7] (find-cycle (unit-decimal 7)))
    (should= [6] (find-cycle (unit-decimal 6)))
    (should= [] (find-cycle [1 2 1 2 3 4 5])))

;  (it "playing a bit"
;;    (should= 519 (count (find-cycle (unit-decimal 577))))
;    (should= [] (take 100 (unit-decimal 884)))
;    )

  (it "Solves #26"
    (should= 7 (euler-26 10))
;    (should= 983 (euler-26 1000))
    )
)

(run-specs)
