(ns learning-cloyure.Loops)

(defn ejemplo []
  
  ;while
  (println "Loop-while")
  (def x (atom 1))
  (while (< @x 5)
    (do
      (println @x)    
      (swap! x inc)
      )
    
    )
  
  ;for-each
  (println "Loop-for each")
  (doseq [n [100 12 43 13 5]]
  (println n))
  
  ;dotimes es usado para ejecutar una sentencias x veces
  (println "Loop-dotimes")
  (dotimes [n 6]
    (println n)
    )
  
  ;for
  (println "Loop-for")
  (loop [x 0
         conta 10]
    (when (<= x conta)
      (println x)
      (recur (inc x) conta)
      )
    )
  )
(ejemplo)