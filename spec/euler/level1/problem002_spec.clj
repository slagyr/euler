(ns euler.level1.problem002-spec
  (:use
    [speclj.core]
    [euler.level1.problem002])
  )

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"
  (it "Gets next fibonacci term"
    (should= 1 (get-next-fib-term 1))
    (should= 2 (get-next-fib-term 2))
    (should= 3 (get-next-fib-term 3))
    (should= 5 (get-next-fib-term 4))
    )
  (it "Generates fibonacci sequence of length n"
    (should= '(1) (get-fib-seq 1))
    (should= '(1 2) (get-fib-seq 2))
    (should= '(1 2 3) (get-fib-seq 3))
    (should= '(1 2 3 5) (get-fib-seq 4))
    )
  (it "Checks if number is even"
    (should= false (is-even? 1))
    (should= true (is-even? 2))
    (should= false (is-even? 3))
    (should= true (is-even? 4))
    )
  (it "Solves #2"
    (should= 10 (euler-2 5))
    (should= 4613732 (euler-2 33))
    )
  )

(run-specs)
