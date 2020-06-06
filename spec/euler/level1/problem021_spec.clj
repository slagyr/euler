(ns euler.level1.problem021-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem021 :refer :all]))

;Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
;If d(a) = b and d(b) = a, where a != b, then a and b are an amicable pair and each of a and b are called amicable numbers.
;
;For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
;
;Evaluate the sum of all the amicable numbers under 10000.

(describe "Euler Problem #21"

  (it "calculates d"
    (should= 28 (d 28))
    (should= 284 (d 220))
    (should= 220 (d 284)))

  (it "properly calculated amicable pairs"
    (let [pairs (amicable-pairs 300)]
      (doseq [[a b] pairs]
        (should= b (d a))
        (should= a (d b)))))

  (it "Solves #21"
    (should= 504 (euler-21 300))
;    (should= 31626 (euler-21 10000))
    )
  )

(run-specs)
