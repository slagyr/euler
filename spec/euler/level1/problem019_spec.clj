(ns euler.level1.problem019-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem019 :refer :all]))

;You are given the following information, but you may prefer to do some research for yourself.
;
;1 Jan 1900 was a Monday.
;Thirty days has September,
;April, June and November.
;All the rest have thirty-one,
;Saving February alone,
;Which has twenty-eight, rain or shine.
;And on leap years, twenty-nine.
;A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
;How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

(describe "Euler Problem #19"

  (it "know if a date is a sunday"
    (should= true (sunday? (date 2006 1 1)))
    (should= false (sunday? (date 2007 1 1)))
    (should= false (sunday? (date 2008 1 1)))
    (should= false (sunday? (date 2009 1 1)))
    (should= false (sunday? (date 2010 1 1)))
    (should= false (sunday? (date 2011 1 1)))
    (should= true (sunday? (date 2012 1 1))))

  (it "rolls the date to next first of month"
    (should= (date 2006 2 1) (roll-month (date 2006 1 1)))
    (should= (date 2006 3 1) (roll-month (date 2006 2 1)))
    (should= (date 2006 4 1) (roll-month (date 2006 3 1)))
    (should= (date 2007 1 1) (roll-month (date 2006 12 1))))

  (it "Solves #19"
    (should= 2 (euler-19 (date 2010 1 1) (date 2011 12 31)))
    (should= 171 (euler-19 (date 1901 1 1) (date 2000 12 31))))

  )

(run-specs)

