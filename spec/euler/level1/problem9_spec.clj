(ns euler.level1.problem9-spec
  (:use
    [speclj.core]
    [euler.level1.problem9]))

(describe "Euler Problem #9"

  (it "Solves #9"
    (should= 60 (euler-9 12))
    (should= 31875000 (euler-9 1000)))

  (it "builds a square map"
    (should= {1 1, 4 2, 9 3, 16 4, 25 5, 36 6, 49 7, 64 8, 81 9, 100 10} (square-map 10)))

  (it "finds pythag triplets"
    (should= [[3 4 5]] (pythangorian-triplets-summing-less-than 10))
    (let [result (pythangorian-triplets-summing-less-than 50)]
      (should= 6 (count result))
      (should= [3 4 5] (first result))
      (should= [5 12 13] (second result))
      (should= [6 8 10] (nth result 2))
      (should= [8 15 17] (nth result 3))
      (should= [9 12 15] (nth result 4))
      (should= [12 16 20] (last result))))

;([3 4 5] [5 12 13] [6 8 10] [8 15 17] [9 12 15] [12 16 20])


  )

(run-specs)
