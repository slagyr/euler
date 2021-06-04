(ns euler.level1.problem009-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem009 :refer :all]))

; https://projecteuler.net/problem=9

(describe "euler 9"

  (it "is pythagorean triplet?"
    (should (pythagorean-triplet? [3 4 5]))
    (should-not (pythagorean-triplet? [0 1 2])))

  (it "check if c is perfect square"
   (should (perfect-square? 0))
   (should (perfect-square? 1))
   (should-not (perfect-square? 2))
   (should-not (perfect-square? 3))
   (should (perfect-square? 4))
   (should-not (perfect-square? 5))
   (should (perfect-square? 9))
   )

  (it "sums to n"
    (should-not (sums-to-n? 12 [1 2 3]))
    (should (sums-to-n? 12 [3 4 5])))

  (it "finds all triplets that sum to n"
    (should= [] (find-all-triplets-below-n 0))
    (should= [[1 2 3]] (find-all-triplets-below-n 3))
    (should= [[1 2 3] [1 2 4] [1 3 4] [2 3 4]] (find-all-triplets-below-n 4))
    ;(should= [] (find-all-triplets-below-n 1000)) ;;881 --> ~440
    )

  (it "find pythagorean triplets"
   (should= [] (get-pythagorean-triplets 3))
   (should= [[3 4 5] [6 8 10]] (get-pythagorean-triplets 12))
   (should= [[3 4 5] [5 12 13] [6 8 10] [7 24 25] [8 15 17] [9 12 15] [12 16 20] [15 20 25]] (get-pythagorean-triplets 25))
   ;(should= [] (get-pythagorean-triplets 1000))
   )

(it "solve euler #9"
    (should= 60 (euler-9 12))
    (should= 480 (euler-9 24))
    ;(println "1000 THIS ONE")
    ;(should= 31875000 (euler-9 1000))
    )
  )

;; pyth-triplet that sum to 1000: (200 375 425) n/2 should still get us the answer


(run-specs)
