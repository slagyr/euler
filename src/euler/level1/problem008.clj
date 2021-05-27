(ns euler.level1.problem008)

(defn get-groupings [n size]
 (let [coll (vec (str n))
       n size
       products (vec (str coll))]
  (partition n 1 coll)))

(defn- char-to-digit [coll]
 (map #(Character/digit % 10) coll))

(defn convert-to-int [coll]
 (map char-to-digit coll))

(defn get-product-set [coll]
 (apply sorted-set (map #(reduce * %) coll)))

(defn euler-8 [n]
 (->> (get-groupings n 13)
      (convert-to-int)
      (get-product-set)
      (last)))
