(ns euler.level2.problem032
  (:require
    [clojure.math.combinatorics :refer [permutations]]))

(defn digit-permutations []
  (permutations [1 2 3 4 5 6 7 8 9]))

(defn- make-num
  ([digits start] (Integer/parseInt (apply str (subvec digits start))))
  ([digits start end] (Integer/parseInt (apply str (subvec digits start end)))))

(defn triplets-of
  ([digits] (triplets-of digits 1 2))
  ([digits i j]
    (loop [i i j j]
      (let [a (make-num digits 0 i) b (make-num digits i j) c (make-num digits j)]
        (cond
          (> a c b) nil
          (> b c) (recur (inc i) (inc (inc i)))
          :else (cons [a b c] (lazy-seq (triplets-of digits i (inc j)))))))))

(defn euler-32 []
  (let [triplet-seqs (map triplets-of (digit-permutations))
        all-triplets (apply concat triplet-seqs)]
    (apply +
      (reduce
        (fn [results [a b c]] (if (= c (* a b)) (conj results c) results))
          #{}
        all-triplets))))
