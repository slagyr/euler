(defproject euler "1.0.0-SNAPSHOT"
  :description "Solutions to https://projecteuler.net"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/math.combinatorics "0.1.6"]]
  :profiles {:dev {:dependencies [[speclj "3.3.2"]]}}
  :plugins [[speclj "3.3.2"]]
  :test-paths ["spec/"]
  :aliases {"euler" ["run" "-m" "euler.generator"]}
  )
