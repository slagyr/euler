(ns euler.level1.problem015-spec
  (:use
    [speclj.core]
    [euler.level1.problem015]
    [euler.graph]
    [euler.debug]))

(describe "Euler Problem #15"

;  (it "calculates neighbor coordinates" do
;    (should= [[5 4][6 5][5 6][4 5]] (neighbors-of [5 5] 10))
;    (should= [[1 0][0 1]] (neighbors-of [0 0] 10))
;    (should= [[0 4][1 5][0 6]] (neighbors-of [0 5] 10))
;    (should= [[10 9][9 10]] (neighbors-of [10 10] 10))
;    (should= [[5 9][6 10][4 10]] (neighbors-of [5 10] 10)))
;
;  (it "calculates greater neighbor coordinates" do
;    (should= [[6 5][5 6]] (steps-from [5 5] 10))
;    (should= [[1 0][0 1]] (steps-from [0 0] 10))
;    (should= [[1 5][0 6]] (steps-from [0 5] 10))
;    (should= [] (steps-from [10 10] 10))
;    (should= [[6 10]] (steps-from [5 10] 10)))
;
;  (it "builds square graph of dimension 1"
;    (let [g (square-graph 1)]
;      (should= #{[0 0] [0 1] [1 0] [1 1]} (nodes g))
;      (should=  {[0 1] 1 [1 0] 1} (edges-from g [0 0]))
;      (should= {[1 1] 1} (edges-from g [0 1]))
;      (should= {[1 1] 1} (edges-from g [1 0]))
;      (should= {} (edges-from g [1 1]))))
;
;  (it "builds square graph of dimension 2"
;    (let [g (square-graph 2)]
;      (should= #{[0 0][0 1][0 2][1 0][1 1][1 2][2 0][2 1][2 2]} (nodes g))
;      (should= {[0 1] 1 [1 0] 1} (edges-from g [0 0]))
;      (should= {[1 1] 1 [0 2] 1} (edges-from g [0 1]))
;      (should= {[1 2] 1} (edges-from g [0 2]))
;      (should= {[1 1] 1 [2 0] 1} (edges-from g [1 0]))
;      (should= {[1 2] 1 [2 1] 1} (edges-from g [1 1]))
;      (should= {[2 2] 1} (edges-from g [1 2]))
;      (should= {[2 1] 1} (edges-from g [2 0]))
;      (should= {[2 2] 1} (edges-from g [2 1]))
;      (should= {} (edges-from g [2 2]))))

  (it "calculates Pascals triangle"
    (should= [1] (nth (pascals-triangle) 0))
    (should= [1 1] (nth (pascals-triangle) 1))
    (should= [1 2 1] (nth (pascals-triangle) 2))
    (should= [1 3 3 1] (nth (pascals-triangle) 3))
    (should= [1 4 6 4 1] (nth (pascals-triangle) 4))
    (should= [1 5 10 10 5 1] (nth (pascals-triangle) 5))
    (should= [1 6 15 20 15 6 1] (nth (pascals-triangle) 6)))

  (it "Solves #15"
    (should= 2 (euler-15 1))
    (should= 6 (euler-15 2))
    (should= 20 (euler-15 3))
    (should= 70 (euler-15 4))
    (should= 252 (euler-15 5))
    (should= 924 (euler-15 6))
    (should= 3432 (euler-15 7))
    (should= 12870 (euler-15 8))
    (should= 48620 (euler-15 9))
    (should= 184756 (euler-15 10))
    (should= 705432 (euler-15 11))
    (should= 137846528820 (euler-15 20))
    )
  )

(run-specs)
