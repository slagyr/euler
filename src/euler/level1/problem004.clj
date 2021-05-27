(ns euler.level1.problem004)

(def prod (for [num-1 (vec (range 1 1000))
                num-2 (vec (range 1 1000))]
            [num-1 num-2]))

(def six-digit-products
  (sort(set (map #(reduce * %) prod)))
  )

(defn is-palindrome? [num]
  (let [num (vec (str num))
        rev-num (vec (reverse num))]
    (if (= 0 (compare num rev-num))
      true
      false)
    )
  )

(defn euler-4 [n]
  (last (filter is-palindrome? six-digit-products))
  )


