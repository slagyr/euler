(ns euler.level1.problem009
  (:use
    [euler.numbers]))

(defn square-map [max]
  (into {} (map (fn [n] [(sq n) n]) (take max (naturals)))))

(defn next-triplet [[a b c] max-sum squares]
  (loop [a a b (inc b)]
    (if (> a (* max-sum 1/3))
      nil
      (let [c (squares (+ (sq a) (sq b)))]
        (if (and c (< (+ a b c) max-sum))
          [a b c]
          (if (> (+ a b) (- max-sum b))
            (recur (inc a) (+ 2 a))
            (recur a (inc b))))))))

(defn pythangorian-triplets-summing-less-than [max-sum]
  (let [squares (square-map (* 2 max-sum))]
    (take-while
      identity
      (iterate #(next-triplet % max-sum squares) [3 4 5]))))

(defn euler-9 [n]
  (let [triplets (pythangorian-triplets-summing-less-than (inc n))
        result (some #(if (= n (apply + %)) %) triplets)]
    (if result
      (apply * result))))
