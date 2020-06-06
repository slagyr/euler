(ns euler.io-spec
  (:require
    [speclj.core :refer :all]
    [euler.io :refer :all]))

(def sample "
1 2 3
4 5 6
7 8 9")

(describe "Euler IO"

  (it "parses lines"
    (let [lines (parse-lines sample)]
      (should= "1 2 3" (first lines))
      (should= "4 5 6" (second lines))
      (should= "7 8 9" (last lines))))

  (it "converts a string to grid of numbers"
    (let [grid (str->grid sample)]
      (should= [1 2 3] (first grid))
      (should= [4 5 6] (second grid))
      (should= [7 8 9] (nth grid 2))))

  )


(run-specs)
