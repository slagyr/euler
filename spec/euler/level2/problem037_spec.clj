(ns euler.level2.problem037-spec
  (:require
    [euler.level2.problem037 :refer :all]
    [speclj.core :refer :all]))

; https://projecteuler.net/problem=37

(describe "Euler Problem #37"

  (it "generates candidates"
    (let [result (candidates)]
      (should= 2222 (first result))
      (should= 7777 (last result))))

  (it "left truncations"
    (should= [234 34 4] (left-truncations 1234))
    (should= [876 76 6] (left-truncations 9876)))

  (it "right truncations"
    (should= [123 12 1] (right-truncations 1234))
    (should= [987 98 9] (right-truncations 9876)))

  (it "truncatable-prime?"
    (should= true (truncatable-prime? 3797))
    (should= false (truncatable-prime? 9999)))

  (it "truncatable-primes"
    (should= [23 37 53 73] (truncatable-primes 99))
    (should-contain 3797 (truncatable-primes 3999))
    #_(let [result (truncatable-primes 799999)]
      (prn "result: " result)
      (should= 11 (count result))))

  #_(it "Solves #37"
    (should= (apply + [23 37 53 73]) (euler-37 99))
    (should= 748317 (euler-37 799999)))
  )

(run-specs)
