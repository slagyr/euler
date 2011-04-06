(ns euler.level2.problem026
  (:use
    [euler.math :only (primes)]))

(defn- magnify [remainder divisor]
  (if (> remainder divisor)
    remainder
    (recur (* 10 remainder) divisor)))

(defn- quotient-digits [numerator denominator]
  (let [numerator (magnify numerator denominator)
        quotient (quot numerator denominator)
        remainder (rem numerator denominator)]
    (if (zero? remainder)
      [quotient]
      (cons quotient (lazy-seq (quotient-digits remainder denominator))))))

(defn starts-with? [col start]
  (cond
    (empty? start) true
    (seq col) (if (= (first col) (first start)) (recur (rest col) (rest start)) false)
    :else false))

(defn subpatterns [pattern]
  (if (empty? pattern)
    []
    (cons pattern (lazy-seq (subpatterns (rest pattern))))))

(def cycle-repeat-threshold 5)

(defn- confirmed-cycle? [col pattern]
  (let [pattern-length (count pattern)
        checks (- cycle-repeat-threshold 2)] ; because finding a repeat pattern requires 2 cycles
    (loop [checks checks col (drop pattern-length col)]
      (cond
        (= 0 checks) true
        (not (starts-with? col pattern)) false
        :else (recur (dec checks) (drop pattern-length col))))))

(def max-cycle-length 1000)

(defn find-cycle
  ([col] (find-cycle col []))
  ([col max-pattern]
    (if (or (empty? col) (> (count max-pattern) max-cycle-length))
      []
      (let [cycle-pattern (first (drop-while #(not (starts-with? col %)) (subpatterns max-pattern)))]
        (if (and cycle-pattern (confirmed-cycle? col cycle-pattern))
          cycle-pattern
          (let [new-max-pattern (conj (vec max-pattern) (first col))]
            (recur (rest col) new-max-pattern)))))))

(defn unit-decimal [denominator]
  (quotient-digits 1 denominator))

(defn euler-26 [n]
  (loop [max-length 0 max-d nil ds (take-while #(< % n) primes)]
    (if (empty? ds)
      max-d
      (let [d (first ds)
            decimals (unit-decimal d)
            cycle (find-cycle decimals)
            cycle-length (count cycle)]
;        (println d ":" cycle-length)
        (if (> cycle-length max-length)
          (recur cycle-length d (rest ds))
          (recur max-length max-d (rest ds)))))))
