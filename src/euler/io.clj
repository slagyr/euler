(ns euler.io
  (:require
    [clojure.string :as string]))


(defn parse-lines [src]
  (let [src (string/trim src)]
    (map string/trim (string/split src #"\n|\r\n"))))
