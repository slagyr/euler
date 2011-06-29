(ns euler.sequtil)

(defn digits [n]
  (map #(Integer/parseInt (str %)) (seq (str n))))
