(ns euler.level1.problem019
  (:import
    [java.util Date Calendar GregorianCalendar]))

(defn date
  ([year month day] (GregorianCalendar. year (dec month) day)))

(defn sunday? [date]
  (= Calendar/SUNDAY (.get date Calendar/DAY_OF_WEEK)))

(defn roll-month [date]
  (let [new-date (GregorianCalendar.)]
    (.setTime new-date (.getTime date))
    (.add new-date Calendar/MONTH 1)
    new-date))

(defn euler-19 [start end]
  (loop [date start count 0]
    (if (.after date end)
      count
      (if (sunday? date)
        (recur (roll-month date) (inc count))
        (recur (roll-month date) count)))))
