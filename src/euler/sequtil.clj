(ns euler.sequtil)

(defn bias-slice [coll width]
  (let [coll (vec coll)]
    (map #(subvec coll (- % width) %) (range width (inc (count coll))))))
