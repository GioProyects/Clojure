(ns learning-cloyure.Archivos
  (:gen-class))


(defn reading []
  (def cad (slurp "ejemplo"))
  (println cad))
(reading)

(defn reading2 []
  (with-open [rdr (clojure.java.io/reader "ejemplo")]
    (reduce conj [] (line-seq rdr)) ))
(reading2)


(defn writing []
  (spit "ejemplo"
        "esto es una linea nueva")
  )
(writing)


(defn writing2 []
  (with-open [w (clojure.java.io/writer "ejemplo" :append true)]
    (.write w (str "\nhola mundo")))
  )
(writing2)

(defn existencia []
  (println (.exists (clojure.java.io/file "ejemplo"))))
(existencia)