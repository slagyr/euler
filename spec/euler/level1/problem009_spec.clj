(ns euler.level1.problem009-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem009 :refer :all]))

; https://projecteuler.net/problem=9

(describe "euler 9"

  (it "is pythagorean triplet?"
    (should (pythagorean-triplet? [3 4 5]))
    (should-not (pythagorean-triplet? [0 1 2])))

  (it "check if c is a perfect square"
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

  (it "maybe returns a pythagorean triplet"
   (should-be-nil (maybe-p-triplet [1 2]))
   (should= [3 4 5] (maybe-p-triplet [3 4]))
   (should= [6 8 10] (maybe-p-triplet [6 8]))
   )

  (it "finds all triplets below n"
    (should= [] (find-pythagorean-triplets-below-n 0))
    (should= [] (find-pythagorean-triplets-below-n 1))
    (should= [] (find-pythagorean-triplets-below-n 2))
    (should= [] (find-pythagorean-triplets-below-n 3))
    (should= [] (find-pythagorean-triplets-below-n 4))
    (should= [[3 4 5]] (find-pythagorean-triplets-below-n 5))
    (should= [[3 4 5] [6 8 10]] (find-pythagorean-triplets-below-n 10))
    )

(it "solve euler #9"
    (should= 60 (euler-9 12))
    (should= 480 (euler-9 24))
    (should= 31875000 (euler-9 1000))
    )
  )

(run-specs)
