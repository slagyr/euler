(ns euler.sequtil_spec
  (:use
    [speclj.core]
    [euler.sequtil]))

(describe "Seq Util"

  (it "slices seqs on the bias"
    (should= [[1] [2] [3] [4] [5]] (bias-slice [1 2 3 4 5] 1))
    (should= [[1 2][2 3][3 4][4 5]] (bias-slice [1 2 3 4 5] 2))
    (should= [[1 2 3][2 3 4][3 4 5]] (bias-slice [1 2 3 4 5] 3))
    (should= [[1 2 3 4][2 3 4 5]] (bias-slice [1 2 3 4 5] 4))
    (should= [[1 2 3 4 5]] (bias-slice [1 2 3 4 5] 5))))

  (it "cant slice small seqs on the bias"
    (should= [] (bias-slice [1 2 3] 4))
  )
