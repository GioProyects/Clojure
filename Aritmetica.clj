(ns learning-cloyure.Aritmetica)

(defn ejemplo []
  
  ;aritmetica basica
  (println "aritmetica basica")
  (def x (+ 2 2))
  (println x)
  
  (def x (- 2 2))
  (println x)
  
  (def x (* 2 2))
  (println x)
  
  (def x (float (/ 2 2)))
  (println x)
  
  (def x (inc 2))
  (println x)
  
  (def x (dec 2))
  (println x)
  
  (def x (max 3 6 2))
  (println x)
  
  (def x (min 3 6 2))
  (println x)
  
  (def x (rem 6 2))
  (println x)
  ;========================
  
  ;operaciones relacioinales
  (println "operaciones relacioinales")
  (def x (= 2 2))
  (println x)
  
  (def x (not= 3 2))
  (println x)
  
  (def x (< 2 3))
  (println x)
  
  (def x (<= 2 3))
  (println x)
  
  
  (def x (= 3 2))
  (println x)
  
  (def x (>= 3 2))
  (println x)
  
  ;=================================
  
  ;operaciones logicas
  (println "operaciones logicas")
  
  (def x (or true true))
  (println x)
  
  (def x (and true false))
  (println x)
  
  (def x (not true))
  (println x)
  ;=================================
  
  
  ;operacion bit a bit
  (println "operacion bit a bit")
  
  (def x (bit-and 00111100 00001101))
  (println x)
  
  (def x (bit-or 00111100 00001101))
  (println x)
  
  (def x (bit-xor 00111100 00001101))
  (println x)
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  )(ejemplo)