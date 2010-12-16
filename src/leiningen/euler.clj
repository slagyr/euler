(ns leiningen.euler
  (:import
    [java.io FileOutputStream]))

(def spec-template
"(ns euler.level1.problem!N!-spec
  (:use
    [speclj.core]
    [euler.level1.problem!N!]))

(describe \"Euler Problem #!N!\"

  (it \"Solves #!N!\"
    (should= -1 (euler-!N! -1)))
  )

(run-specs)
"
)

(def src-template
"(ns euler.level1.problem!N!)

(defn euler-!N! [n]
  )
"
  )

(defn add-N [src n]
  (.replace src "!N!" (str n)))

(defn write-file [path content]
  (let [output (FileOutputStream. path)
        bytes (.getBytes content)]
    (println "writing" (count bytes) "bytes to" path)
    (.write output (.getBytes content))
    (.close output)))

(defn euler [n]
  (let [spec-content (add-N spec-template n)
        spec-file (str "spec/euler/level1/problem" n "_spec.clj")
        src-content (add-N src-template n)
        src-file (str "src/euler/level1/problem" n ".clj")]
    (write-file spec-file spec-content)
    (write-file src-file src-content)))
