(ns euler.level2.problem028-spec
  (:use
    [speclj.core]
    [euler.level2.problem028]))

;Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:
;
;21 22 23 24 25
;20  7  8  9 10
;19  6  1  2 11
;18  5  4  3 12
;17 16 15 14 13
;
;It can be verified that the sum of the numbers on the diagonals is 101.
;
;What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?

(describe "Euler Problem #28"

  (it "calculated the shells the layers of the spiral"
    (should= [1] (first (spiral-layers)))
    (should= [2 3 4 5 6 7 8 9] (second (spiral-layers)))
    (should= (range 10 26) (nth (spiral-layers) 2))
    (should= (range 26 50) (nth (spiral-layers) 3)))

  (it "finds the corners of a layer"
    (should= [1] (corners-of (first (spiral-layers))))
    (should= [3 5 7 9] (corners-of (second (spiral-layers))))
    (should= [13 17 21 25] (corners-of (nth (spiral-layers) 2)))
    (should= [31 37 43 49] (corners-of (nth (spiral-layers) 3))))

  (it "Solves #28"
    (should= 1 (euler-28 1))
    (should= 25 (euler-28 3))
    (should= 101 (euler-28 5))
;    (should= 669171001 (euler-28 1001))
    )
  )

(run-specs)
