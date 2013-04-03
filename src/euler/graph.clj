(ns euler.graph)

(defprotocol Graph
  (nodes [this])
  (edges [this])
  (add-nodes [this ids])
  (add-edges [this from paths])
  )

(deftype PersistentGraph [nodes edges]
  Graph
  (nodes [this] nodes)
  (edges [this] edges)
  (add-nodes [this ids]
    (PersistentGraph. (apply conj nodes ids) edges))
  (add-edges [this from paths]
    (PersistentGraph. nodes (assoc edges from paths))))

(defn new-graph
  ([] (PersistentGraph. #{} {}))
  ([nodes] (PersistentGraph. (set nodes) {})))

(defn add-node [g node-id]
  (add-nodes g [node-id]))

(defn node? [g id]
  (contains? (nodes g) id))

(defn- check-node [g & ids]
  (doseq [id ids]
    (if (not (node? g id))
      (throw (Exception. (str "Graphs is missing node: " id))))))

(defn edges-from [g id]
  (check-node g id)
  (or ((edges g) id) {}))

(defn add-edge [g from to value]
  (check-node g from to)
  (let [edges (assoc (edges-from g from) to value)]
    (add-edges g from edges)))

