(ns leiningen.euler
  (:import
    [java.io FileOutputStream]))

(def spec-template
"(ns euler.level!L!.problem!NS!-spec
  (:use
    [speclj.core]
    [euler.level!L!.problem!NS!]))

; http://projecteuler.net/index.php?section=problems&id=!N!

(describe \"Euler Problem #!N!\"

  (it \"Solves #!N!\"
    (should= -1 (euler-!N! -1)))
  )

(run-specs)
"
)

(def src-template
"(ns euler.level!L!.problem!NS!)

(defn euler-!N! [n]
  )
"
  )

(defn render [src mapping]
  (reduce
    (fn [src [key value]] (.replace src (format "!%s!" key) (str value)))
    src
    (seq mapping)))

(defn write-file [path content]
  (.mkdirs (.getParentFile (java.io.File. path)))
  (let [output (FileOutputStream. path)
        bytes (.getBytes content)]
    (println "writing" (count bytes) "bytes to" path)
    (.write output (.getBytes content))
    (.close output)))

(defn euler [n]
  (let [n (Integer/parseInt n)
        n-str (.format (java.text.DecimalFormat. "000") n)
        level (inc (quot (dec n) 25))
        spec-content (render spec-template {"N" n "NS" n-str "L" level})
        spec-file (format "spec/euler/level%s/problem%s_spec.clj" level n-str)
        src-content (render src-template {"N" n "NS" n-str "L" level})
        src-file (format "src/euler/level%s/problem%s.clj" level n-str)]
    (write-file spec-file spec-content)
    (write-file src-file src-content)))
