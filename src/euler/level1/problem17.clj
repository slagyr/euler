(ns euler.level1.problem17
  (:require
    [clojure.string :as string]))

(def tens-translations {
  9 "ninety"
  8 "eighty"
  7 "seventy"
  6 "sixty"
  5 "fifty"
  4 "fourty"
  3 "thirty"
  2 "twenty"
  })

(def small-translations {
  19 "nineteen"
  18 "eighteen"
  17 "seventeen"
  16 "sixteen"
  15 "fifteen"
  14 "fourteen"
  13 "thirteen"
  10 "ten"
  12 "twelve"
  11 "eleven"
  9 "nine"
  8 "eight"
  7 "seven"
  6 "six"
  5 "five"
  4 "four"
  3 "three"
  2 "two"
  1 "one"
  0 "zero"
  })


(defn say [n]
  (loop [n n translation ""]
    (cond
      (= 0 n) translation
      (< n 20) (recur (- n n) (str translation (small-translations n)))
      (< n 100)
      (let [quo (int (/ n 10))
            n (rem n 10)
            translation (str translation (tens-translations quo))
            translation (if (= 0 n) translation (str translation "-"))]
        (recur n translation))
      (< n 1000)
      (let [quo (int (/ n 100))
            n (rem n 100)
            translation (str translation (small-translations quo) " hundred")
            translation (if (= 0 n) translation (str translation " and "))]
        (recur n translation))
      :else "one thousand"
      )))

(defn count-letters [phrase]
  (count (seq (string/replace (string/replace phrase "-" "") " " ""))))

(defn euler-17 [n]
  (reduce
    (fn [sum n] (+ sum (count-letters (say n))))
    0
    (range 1 (inc n))))
