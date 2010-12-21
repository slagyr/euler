(ns euler.debug
  (:import
    [java.text DecimalFormat]))

(def start-time (System/currentTimeMillis))
(def mark (atom (System/currentTimeMillis)))
(def fmt (DecimalFormat. "#,##0.000"))

(defn reset-mark []
  (reset! mark (System/currentTimeMillis)))

(defn diff [before after]
  (/ (double (- after before)) 1000.0))

(defn d [& message]
  (let [now (System/currentTimeMillis)
        interval (diff @mark now)
        total (diff start-time now)
        message (concat [(str (.format fmt interval) "|" (.format fmt total) ":")] message)]
    (apply println message)
    (reset-mark)))
