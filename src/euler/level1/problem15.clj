(ns euler.level1.problem15
  (:use
    [euler.sequtil :only (bias-slice)]))

;(def neighbor-masks [[0 -1] [1 0] [0 1] [-1 0]])
;(def step-masks [[1 0] [0 1]])
;
;(defn- add-coords [[x1 y1] [x2 y2]]
;  [(+ x1 x2) (+ y1 y2)])
;
;(defn- valid-coord? [[x y] max]
;  (and
;    (>= x 0)
;    (>= y 0)
;    (<= x max)
;    (<= y max)))

;(defn neighbors-of [coords max]
;  (filter
;    #(valid-coord? % max)
;    (map #(add-coords coords %) neighbor-masks)))

;(defn steps-from [coords max]
;  (filter
;    #(valid-coord? % max)
;    (map #(add-coords coords %) step-masks)))
;
;(defn square-graph [n]
;  (let [dim (range (inc n))
;        coords (for [x dim y dim] [x y])
;        g (new-graph coords)]
;    (reduce
;      (fn [g coord]
;        (let [neighbors (steps-from coord n)
;              edges (apply hash-map (interleave neighbors (repeat 1)))]
;          (add-edges g coord edges)))
;      g
;      coords)))

;(defn- dup-edge? [path node next]
;  (some
;    (fn [[a b]] (or (and (= a node) (= b next)) (and (= b node) (= a next))))
;    (bias-slice path 2)))

;(defn- find-paths [g start goal]
;  (loop [path [start] edges-stack [(keys (edges-from g start))] tally 0]
;    (println "path: " path)
;    (if (not (seq path))
;      tally
;      (let [node (last path)
;            edges (last edges-stack)
;            next (first edges)
;            edges-stack (pop edges-stack)]
;        (cond
;          (nil? next) (recur (pop path) edges-stack tally)
;          (= goal next) (recur path (conj edges-stack (rest edges)) (inc tally)) ;(conj paths (conj path next)))
;          ;          (dup-edge? path node next) (recur path (conj edges-stack (rest edges)) paths)
;          :else (recur (conj path next) (conj edges-stack (rest edges) (keys (edges-from g next))) tally))))))

;(defn euler-15 [n]
;  (let [g (square-graph n)
;        start [0 0]
;        goal [n n]
;        _ (d "about to find paths" n)
;        paths (find-paths g start goal)
;        _ (d "done!")]
;    paths))



(defn- next-pascals-triangle-row [row]
  (let [pairs (bias-slice row 2)
        innards (map #(apply + %) pairs)]
    (concat [1] innards [1])))

(defn pascals-triangle []
  (iterate next-pascals-triangle-row [1]))

(defn euler-15 [n]
  (let [row (nth (pascals-triangle) (* n 2))]
    (nth row n)))
