(ns euler.core
  (:require [clojure.edn :as edn]))

(defn digits [n]
  (map #(Integer/parseInt (str %)) (seq (str n))))

(defn s->i [s]
  (Integer/parseInt s))

(defn digits->n [digits]
  (s->i (apply str digits)))

(defn ->inspect [x]
  (prn x)
  x)
