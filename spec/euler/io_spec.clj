(ns euler.io-spec
  (:use
    [speclj.core]
    [euler.io]))

(def sample "
1 2 3
4 5 6
7 8 9")

(describe "Euler IO"

  (it "parses lines"
    (let [lines (parse-lines sample)]
      (should= "1 2 3" (first lines))
      (should= "4 5 6" (second lines))
      (should= "7 8 9" (last lines)))))

(run-specs)
