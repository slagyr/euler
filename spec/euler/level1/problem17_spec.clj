(ns euler.level1.problem17-spec
  (:use
    [speclj.core]
    [euler.level1.problem17]))

;If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are
; 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
;
;If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
; how many letters would be used?
;
;NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two)
; contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of
; "and" when writing out numbers is in compliance with British usage.

(describe "Euler Problem #17"

  (it "can say numbers up to 20"
    (should= "one" (say 1))
    (should= "two" (say 2))
    (should= "three" (say 3))
    (should= "four" (say 4))
    (should= "five" (say 5))
    (should= "six" (say 6))
    (should= "seven" (say 7))
    (should= "eight" (say 8))
    (should= "nine" (say 9))
    (should= "ten" (say 10))
    (should= "eleven" (say 11))
    (should= "twelve" (say 12))
    (should= "thirteen" (say 13))
    (should= "fourteen" (say 14))
    (should= "fifteen" (say 15))
    (should= "sixteen" (say 16))
    (should= "seventeen" (say 17))
    (should= "eighteen" (say 18))
    (should= "nineteen" (say 19))
    (should= "twenty" (say 20)))

  (it "can say the numbers less than 100"
    (should= "twenty-one" (say 21))
    (should= "thirty-two" (say 32))
    (should= "forty-three" (say 43))
    (should= "fifty-four" (say 54))
    (should= "sixty-five" (say 65))
    (should= "seventy-six" (say 76))
    (should= "eighty-seven" (say 87))
    (should= "ninety-eight" (say 98)))

  (it "can say all numbers less than 1000"
    (should= "one hundred" (say 100))
    (should= "one hundred and one" (say 101))
    (should= "two hundred and twelve" (say 212))
    (should= "three hundred and twenty-five" (say 325))
    (should= "nine hundred and ninety-nine" (say 999)))

  (it "can say 1000"
    (should= "one thousand" (say 1000)))

  (it "counts letters"
    (should= 3 (count-letters "one"))
    (should= 9 (count-letters "twenty-one"))
    (should= 16 (count-letters "one hundred and one")))

  (it "Solves #17"
    (should= 19 (euler-17 5))
    (should= 21124 (euler-17 1000))
    )
  )

(run-specs)
