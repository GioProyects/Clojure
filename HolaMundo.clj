(ns learning-cloyure.HolaMundo
  (:gen-class))

;display hola mundo
(defn ejemplo []
  (def x 1)
  
  (def y 1.4)
  
  (def str1 "Hola mundo")
  
  (println x)
  (println y)
  (println str1)
  )
(ejemplo)