(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "Euler Problem #3"
  (it "Gets the next factor greater than 1"
    (should= 2 (find-factor 10)))

  (it "Gets largest factor of n"
    (should= 29 (get-max #{nil 7 13 29 5})))

  (it "Gets a list of all the factors > 1 for n "
    (should= #{nil 7 13 29 5} (factorialize 13195)))

  (it "Solves #3"
    (should= 6857 (euler-3 600851475143)))
  )

(run-specs)
