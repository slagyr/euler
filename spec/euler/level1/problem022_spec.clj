(ns euler.level1.problem022-spec
  (:use
    [speclj.core]
    [euler.level1.problem022]))

;Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order.
; Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
;
;For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938  53 = 49714.
;
;What is the total of all the name scores in the file?

(describe "Euler Problem #22"

  (it "reads the names"
    (let [names (read-names)]
      (should= "MARY" (first names))
      (should= "PATRICIA" (second names))))

  (it "calculated letter values"
    (should= 1 (letter-value \A))
    (should= 2 (letter-value \B))
    (should= 3 (letter-value \C))
    (should= 26 (letter-value \Z)))

  (it "calculates name value"
    (should= 53 (name-value "COLIN"))
    (should= 57 (name-value "MARY"))
    (should= 77 (name-value "PATRICIA")))

  (it "Solves #22"
    (should= (+ (* 1 53) (* 2 57) (* 3 77)) (euler-22 ["MARY", "PATRICIA", "COLIN"]))
    (should= 871198282 (euler-22 (read-names))))
  )

(run-specs)
