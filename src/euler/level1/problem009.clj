(ns euler.level1.problem009)

(defn pythagorean-triplet? [[a b c]]
 (= (Math/pow c 2) (+ (Math/pow a 2) (Math/pow b 2))))

(defn sums-to-n? [n triple]
 (= n (apply + triple)))

(defn find-all-triplets-below-n [n]
 (let [nums (range 1 (inc n))
       triples (for [a nums b nums c nums] [a b c])]
  (filter #(and (< (first %) (second %)) (< (second %) (last %)) (sums-to-n? n %)) (remove nil? triples))))

(defn get-pythagorean-triplets [n]
 (let [triplets (find-all-triplets-below-n n)]
  (filter #(pythagorean-triplet? %) triplets)))

(defn euler-9 [n]
 (apply * (get-pythagorean-triplets n)))

