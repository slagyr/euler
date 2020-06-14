(ns euler.level2.problem035-spec
  (:require
    [speclj.core :refer :all]
    [euler.level2.problem035 :refer :all]
    [euler.math :as emath]))

; https://projecteuler.net/problem=35

(describe "Euler Problem #35"

  (it "rotations"
    (should= #{2} (rotations 2))
    (should= #{22} (rotations 22))
    (should= #{12 21} (rotations 12))
    (should= #{123 231 312} (rotations 123))
    (should= #{1234 2341 3412 4123} (rotations 1234))
    (should= #{102 21 210} (rotations 102)))

  (it "circular?"
    (let [primes (set (emath/primes< 1000))]
      (should= true (circular? primes 2))
      (should= true (circular? primes 3))
      (should= false (circular? primes 4))
      (should= false (circular? primes 10))
      (should= true (circular? primes 37))
      (should= true (circular? primes 197))
      (should= false (circular? primes 196))))

  (it "Solves #35"
    (should= 13 (euler-35 100))
    ;(should= 55 (euler-35 1000000))
    )
  )

(run-specs)
