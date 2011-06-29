(ns euler.sequtil_spec
  (:use
    [speclj.core]
    [euler.sequtil]))

(describe "Seq Util"

  (it "separates digits of a number"
    (should= [1] (digits 1))
    (should= [1 2] (digits 12))
    (should= [1 2 3] (digits 123))
    (should= [1 2 3 4] (digits 1234))
    (should= [9 8 7 6] (digits 9876)))

  )
