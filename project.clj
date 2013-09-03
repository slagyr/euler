(defproject euler "1.0.0-SNAPSHOT"
  :description "FIXME: write"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]]
  :profiles {:dev {:dependencies [[speclj "2.5.0"]]}}
  :plugins[[speclj "2.5.0"]]
  :test-paths ["spec/"]
  )
