(ns euler.graph-spec
  (:require
    [speclj.core :refer :all]
    [euler.graph :refer :all]))

(describe "Graph"
  (it "makes a new graph"
    (let [g (new-graph)]
      (should= 0 (count (nodes g)))
      (should= 0 (count (edges g)))))

  (it "knows what nodes it has"
    (let [g (new-graph [:a :b])]
      (should= true (node? g :a))
      (should= true (node? g :b))
      (should= false (node? g :c))
      (should= false (node? g "c"))))

  (it "can add node"
    (let [g (add-node (new-graph) :bill)]
      (should= 1 (count (nodes g)))
      (should= 0 (count (edges g)))
      (should (node? g :bill))))

  (it "can add an edge with a value"
    (let [g
          (-> (new-graph)
            (add-node :a)
            (add-node :b)
            (add-edge :a :b 42))]
      (should= 1 (count (edges g)))
      (should= {:b 42} (edges-from g :a))))

  (it "cant add edge to nodes that dont exist"
    (should-throw
      (-> (new-graph)
        (add-edge :a :b 1))))
      )

(run-specs)
