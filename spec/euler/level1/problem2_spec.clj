(ns euler.level1.problem2-spec
  (:use
    [speclj.core]
    [euler.level1.problem2]))

(describe "Euler Problem #2"

  (it "calculates fibonacci sequence"
    (should= 0 (nth (fib) 0))
    (should= 1 (nth (fib) 1))
    (should= 1 (nth (fib) 2))
    (should= 2 (nth (fib) 3))
    (should= 3 (nth (fib) 4))
    (should= 5 (nth (fib) 5))
    (should= 8 (nth (fib) 6))
    (should= 13 (nth (fib) 7)))

  (it "finds fibs upto"
    (should= [0 1 1 2] (fibs-upto 2))
    (should= [0 1 1 2 3] (fibs-upto 4))
    (should= [0 1 1 2 3 5 8] (fibs-upto 10)))

  (it "solves #2"
    (should= 2 (euler-2 5))
    (should= 10 (euler-2 20))
    (should= 44 (euler-2 100))
    (should= 4613732 (euler-2 4000000)))
  )

(run-specs)