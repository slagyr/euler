(ns euler.numbers_spec
  (:use
    [speclj.core]
    [euler.numbers]))

(describe "Euler Common stuff"

  (it "has natural numbers"
    (should= 1 (first (naturals)))
    (should= 2 (second (naturals)))
    (should= 3 (nth (naturals) 2))
    (should= 1000 (nth (naturals) 999)))

  (it "gets naturals upto"
    (should= [1 2] (naturals-upto 3))
    (should= [1 2 3 4] (naturals-upto 5))
    (should= [1 2 3 4 5 6 7 8 9] (naturals-upto 10)))

  )
