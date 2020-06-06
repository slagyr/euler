(ns euler.level2.problem027-spec
  (:require
    [speclj.core :refer :all]
    [euler.level2.problem027 :refer :all]))

;Euler published the remarkable quadratic formula:
;
;n² + n + 41
;
;It turns out that the formula will produce 40 primes for the consecutive values n = 0 to 39. However,
; when n = 40, 40^2 + 40 + 41 = 40(40 + 1) + 41 is divisible by 41, and certainly when
; n = 41, 41² + 41 + 41 is clearly divisible by 41.
;
;Using computers, the incredible formula  n²  79n + 1601 was discovered, which produces 80 primes for the consecutive
; values n = 0 to 79. The product of the coefficients, 79 and 1601, is 126479.
;
;Considering quadratics of the form:
;
;n² + an + b, where |a| < 1000 and |b| < 1000
;
;where |n| is the modulus/absolute value of n
;e.g. |11| = 11 and |4| = 4
;Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number of primes
; for consecutive values of n, starting with n = 0.

(describe "Euler Problem #27"

  (it "build a quadratic function"
    (let [qf (quadratic-fn 1 41)]
      (should= 41 (qf 0))
      (should= 43 (qf 1)))
    (let [qf (quadratic-fn -1 41)]
      (should= 41 (qf 0))
      (should= 41 (qf 1)))
    (let [qf (quadratic-fn -79 1601)]
      (should= 1601 (qf 0))
      (should= 1523 (qf 1))))

  (it "counts consecutive primes"
    (should= 40 (consecutive-primes (quadratic-fn 1 41)))
    (should= 41 (consecutive-primes (quadratic-fn -1 41)))
    (should= 80 (consecutive-primes (quadratic-fn -79 1601))))

  (it "Solves #27"
    (should= -41 (euler-27 42))
;    (should= -59231 (euler-27 1000))
    )
  )

(run-specs)
