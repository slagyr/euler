(ns euler.problem4)

(defn palindrome? [x]
  (let [s (str x)]
    (= s (apply str (reverse s)))))

(defn euler-4 [digits]
  (let [min (int (* 0.9 (Math/pow 10 digits)))
        max (int (Math/pow 10 digits))
        products (for [a (range min max) b (range min max)] (* a b))
        palindromes (sort (set (filter palindrome? products)))]
    (last palindromes)))
