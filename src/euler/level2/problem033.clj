(ns euler.level2.problem033
  (:require
    [euler.sequtil :as sequtil]
    [euler.math :as emath]
    [clojure.set :as set]))

(defn fraction-candidates-for-numerator [numerator]
  (let [denominators (range (inc numerator) 100)]
    (map #(vector numerator %) denominators)))

(defn fraction-candidates []
  (let [numerators (range 10 99)]
    (mapcat fraction-candidates-for-numerator numerators)))

(defn cancellation [[numerator denominator]]
  (let [numerators (set (sequtil/digits numerator))
        denominators (set (sequtil/digits denominator))
        common-digit (set/intersection numerators denominators)]
    (when (seq common-digit)
      (let [n (set/difference numerators common-digit)
            d (set/difference denominators common-digit)]
        (when (and (and (seq n) (seq d)) (not (zero? (first d))))
          [(first n) (first d)])))))

(defn example? [[n d] [n2 d2]] (= (/ n d) (/ n2 d2)))

(defn find-example [fraction]
  (when-let [cancelled (cancellation fraction)]
    (when (example? fraction cancelled)
      [fraction cancelled])))

(defn find-examples [] (filter identity (map find-example (fraction-candidates))))

(defn trivial? [[[n d] [n2 d2]]]
  (or (and (= n (* n2 10)) (= d (* d2 10)))))

(defn find-non-trivial-examples []
  (->> (find-examples)
       (remove trivial?)))

(defn euler-33 [n]
  (let [examples (find-non-trivial-examples)
        fractions (map first examples)
        n (apply * (map first fractions))
        d (apply * (map second fractions))]
    (/ n d)))
