(ns euler.level1.problem009)

(defn perfect-square? [n]
 (let [root (Math/sqrt n)] (zero? (- root (int root))))
 )

(defn pythagorean-triplet? [[a b c]]
 (= (Math/pow c 2) (+ (Math/pow a 2) (Math/pow b 2))))

(defn sums-to-n? [n triple]
 (= n (apply + triple)))

(defn maybe-p-triplet [[a b]]
 (let [c (+ (* a a) (* b b))]
  (if (perfect-square? c)
   [a b (int (Math/sqrt c))])))

(defn find-pythagorean-triplets-below-n [n]
 (let [nums (range 1 n)
       triples (for [a nums b nums :when (< a b)] (maybe-p-triplet [a b]))]
  (remove nil? triples)))

(defn euler-9 [n]
 (apply * (flatten (filter #(sums-to-n? n %) (find-pythagorean-triplets-below-n n)))))

