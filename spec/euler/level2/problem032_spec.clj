(ns euler.level2.problem032-spec
  (:use
    [speclj.core]
    [euler.level2.problem032]))

; We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.
;
;The product 7254 is unusual, as the identity, 39 * 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.
;
;Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.

(describe "Euler Problem #32"

  (it "get all the permutations of digits"
    (should= [1 2 3 4 5 6 7 8 9] (first (digit-permutations)))
    (should= [1 2 3 4 5 6 7 9 8] (second (digit-permutations))))

  (it "can split digits into triplets"
    (let [triplets (triplets-of [1 2 3 4 5 6 7 8 9])]
      (should= [1 2 3456789] (first triplets))
      (should= [1 23 456789] (second triplets))
      (should= [1 234 56789] (nth triplets 2))
      (should= [1 2345 6789] (nth triplets 3))
      (should= [12 3 456789] (nth triplets 4))
      (should= [12 34 56789] (nth triplets 5))
      (should= [12 345 6789] (nth triplets 6))
      (should= [123 4 56789] (nth triplets 7))
      (should= [1234 5 6789] (last triplets))))

;    (it "Solves #32"
;      (should= 45228 (euler-32)))
    )

  (run-specs)
