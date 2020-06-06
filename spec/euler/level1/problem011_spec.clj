(ns euler.level1.problem011-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem011 :refer :all]
    [euler.io :refer [str->grid]]))

(describe "Euler Problem #11"

  (it "constructs columns"
    (let [grid (str->grid digit-src)
          columns (columns-of grid)]
      (should= 20 (count columns))
      (should= [8 49 81 52 22 24 32 67 24 21 78 16 86 19 4 88 4 20 20 1] (first columns))))

  (it "constructs diagonals"
    (let [grid (str->grid digit-src)
          diags (diagonals-of grid)]
      (should= 39 (count diags))
      (should= [1] (first diags))
      (should= [20 70] (second diags))
      (should= [8] (last diags))))

  (it "Solves #11"
    (should= 70600674 (euler-11 -1)))
  )

(run-specs)
