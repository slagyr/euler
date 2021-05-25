(ns euler.level1.problem008)

(defn char-to-int [coll]
 (map #(Character/digit % 10) coll))

(defn product [coll]
 (map #(reduce * %) coll))

(defn product-set [coll]
 (apply sorted-set (product coll)))

(defn get-product [n]
 (let [digit (vec (str n))
       groupings (map #(into [] %) (partition 13 1 digit))]
  (map char-to-int groupings)
  ))

(defn euler-8 [n]
 (last(product-set (get-product n)))

 )
