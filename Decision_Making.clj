(ns learning-cloyure.Decision_Making
  (:gen-class))


(defn ejemplo []
  (
    ;if==============================
    if (= 4 4)
    (println "son iguales")
    (println "no son iguales")
    ;================================    
    )
  (
    ;if-do==========================
    if (= 2 2)
    (do (println "ambos son iguales")(println "true"))
    (do (println "ambos no son iguales")(println "false"))
    ;================================
    
    )
  
  (
    ;if-statement====================
    if (and (= 2 2) (= 3 1 ))
    (println "valores son iguales")
    (println "valores no son iguales")
    ;================================
    )
  
  (
    ;case-statement====================
    (def x 5)
    (case x 5 (println "x es 5")
      10 (println "x es 10")
      (println "x no es ni 5 ni 10"))
    ;==================================
    
    )
  
  (
    ;cond-statement=====================
    (def x 5)
    (cond
      (= x 5) (println "x es 5")
      (= x 10) (println "x es 10")
      :else (println "x no esta definido"))
    
    ;===================================
    
    
    )
  )
(ejemplo)