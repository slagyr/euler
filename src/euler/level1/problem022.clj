(ns euler.level1.problem022)

(defn read-names []
  (if-let [input (.getResourceAsStream (clojure.lang.RT/baseLoader) "euler/level1/names.txt")]
    (with-open [input input]
      (let [reader (java.io.PushbackReader. (java.io.InputStreamReader. input))]
        (loop [result [] object (read reader false :EOF)]
          (if (= :EOF object)
            (seq result)
            (recur (conj result object) (read reader false :EOF))))))))

(def letter-base (dec (int \A)))

(defn letter-value [letter]
  (- (int letter) letter-base))

(defn name-value [name]
  (apply + (map letter-value (seq name))))

(defn euler-22 [names]
  (apply +
    (map
      (fn [[name position]] (* position (name-value name)))
      (partition 2 (interleave (sort names) (iterate inc 1))))))
