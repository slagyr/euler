(ns euler.level2.problem028)

(defn spiral-layers
  ([] (cons [1] (lazy-seq (spiral-layers 3))))
  ([width]
    (let [start (inc (* (- width 2) (- width 2)))
          end (* width width)]
      (cons (range start (inc end)) (lazy-seq (spiral-layers (+ 2 width)))))))

(defn corners-of [layer]
  (let [width (int (/ (count layer) 4))]
    (if (<= width 1)
      [1]
      (map last (partition width layer)))))

(defn euler-28 [n]
  (let [n-layers (inc (int (/ n 2)))]
    (apply +
      (apply concat
        (map corners-of
          (take n-layers (spiral-layers)))))))
