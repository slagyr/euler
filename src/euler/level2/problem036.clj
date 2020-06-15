(ns euler.level2.problem036
  (:require [clojure.string :as str]))

(defn ->binary [i] (Integer/toString i 2))

(defn palindrome? [x]
  (let [s (str x)]
    (= s (str/reverse s))))

(defn decimal-and-binary-palindrome? [n]
  (and (palindrome? n)
       (palindrome? (->binary n))))

(defn euler-36 [n]
  (->> (range n)
       (filter decimal-and-binary-palindrome?)
       (apply +)))
