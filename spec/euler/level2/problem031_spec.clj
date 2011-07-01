(ns euler.level2.problem031-spec
  (:use
    [speclj.core]
    [euler.level2.problem031]))

; In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:
;
;1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
;It is possible to make £2 in the following way:
;
;1£1 + 150p + 220p + 15p + 12p + 31p
;How many different ways can £2 be made using any number of coins?

(describe "Euler Problem #31"

  (it "calculated value of coins"
    (should= 0 (value-of [0 0 0 0 0 0 0 0]))
    (should= 200 (value-of [1 0 0 0 0 0 0 0]))
    (should= 388 (value-of [1 1 1 1 1 1 1 1])))

;  (it "Solves #31"
;    (should= 73682 (euler-31)))

  )

(run-specs)
