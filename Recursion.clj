(ns learning-cloyure.Recursion)

(defn ejemplo []
  (loop [i 0]
    (when  (< i 100)
      (println i)
      (recur (inc i)))))
(ejemplo)