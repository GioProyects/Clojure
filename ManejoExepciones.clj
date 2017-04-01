(ns learning-cloyure.ManejoExepciones)

;try-catch simple
(defn Example []
   (try
      (aget (int-array [1 2 3]) 5)
      (catch Exception e (println (str "caught exception: " (.toString e))))
      (finally (println "This is our final block")))
   (println "Let's move on"))
(Example)

;try-catch multiple
(defn Example []
   (try
      (def string1 (slurp "Example.txt"))
      (println string1)
      
      (catch java.io.FileNotFoundException e 
        (println (str "caught file exception: " (.getMessage e)))
        )
      
      (catch Exception e 
        (println (str "caught exception: " (.getMessage e)))
        )
      )
   (println "Let's move on"))
(Example)


;con bloque finally

(defn Example []
   (try
      (def string1 (slurp "Example.txt"))
      (println string1)
      
      (catch java.io.FileNotFoundException e 
        (println (str "caught file exception: " (.getMessage e)))
        )
      (catch Exception e 
        (println (str "caught exception: " (.getMessage e)))
        )
      (finally 
        (println "This is our final block"))
      )
   (println "Let's move on"))
(Example)






























