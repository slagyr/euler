(ns euler.level1.problem11-spec
  (:use
    [speclj.core]
    [euler.level1.problem11]))

(describe "Euler Problem #11"

  (it "reads the digit grid"
    (let [grid (parse-digit-grid digit-src)]
      (should= 20 (count grid))
      (doseq [row grid]
        (should= 20 (count row)))
      (should= [8 2 22 97 38 15 0 40 0 75 4 5 7 78 52 12 50 77 91 8] (first grid))))

  (it "constructs columns"
    (let [grid (parse-digit-grid digit-src)
          columns (columns-of grid)]
      (should= 20 (count columns))
      (should= [8 49 81 52 22 24 32 67 24 21 78 16 86 19 4 88 4 20 20 1] (first columns))))

  (it "constructs diagonals"
    (let [grid (parse-digit-grid digit-src)
          diags (diagonals-of grid)]
      (should= 39 (count diags))
      (should= [1] (first diags))
      (should= [20 70] (second diags))
      (should= [8] (last diags))))

  (it "Solves #11"
    (should= 70600674 (euler-11 -1)))
  )

(run-specs)
