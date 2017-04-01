(ns learning-cloyure.Numbers)

(defn ejemplo []
  ;es cero?=========================
  (def x (zero? 0))
  (println x)
  
  (def x (zero? 0.0))
  (println x)
  
  (def x (zero? 1))
  (println x)
  ;=================================
  
  ;es positivo?====================
  (def x (pos? -1))
  (println x)
  
  (def x (pos? 0))
  (println x)
  
  (def x (pos? 1))
  (println x)
  ;================================
  
  ;es negativo?====================
  (def x (neg? -1))
  (println x)
  
  (def x (neg? 0))
  (println x)
  
  (def x (neg? 1))
  (println x)
  ;================================
  
  ;es par?====================
  (def x (even? 0))
  (println x)
  
  (def x (even? 2))
  (println x)
  
  (def x (even? 3))
  (println x)
  ;================================
  
  ;es impar?====================
  (def x (odd? 0))
  (println x)
  
  (def x (odd? 2))
  (println x)
  
  (def x (odd? 3))
  (println x)
  ;================================
  
  ;es numero?====================
  (def x (number? 0))
  (println x)
  
  (def x (number? 0.0))
  (println x)
  
  (def x (number? :a))
  (println x)
  ;================================
  
  ;es entero?====================
  (def x (integer? 0))
  (println x)
  
  (def x (integer? 0.0))
  (println x)
  ;================================
  
  ;es float?====================
  (def x (float? 0))
  (println x)
  
  (def x (float? 0.0))
  (println x)
  ;================================
  
  )
(ejemplo)