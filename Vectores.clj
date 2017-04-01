(ns learning-cloyure.Vectores
  ;(:require [clojure.set :as set])
  )
(defn x[] 
  (println "Vectores"))(x)

(defn ejemplo[]
  (println (vector 1 2 3 5 6))
  )
(ejemplo)

;vector-of crea un vector de tipo primitivo int,long,char,float,double,byte,short,boolena
(defn vector_tipo[]
  (println (vector-of :int 1 2 3))
  )
(vector_tipo)


;nth regresa un dato en una posicion especifica
(defn indice[]
  (println (nth (vector 10 11 12 13 14) 3))
  (println (nth (vector 10,11,12,13,14) 0))
  )
(indice)

;get Devuelve el elemento en la posición de índice en el vector.
(defn dato[]
  (println (get (vector 10 11 12 13 14) 3))
  (println (get (vector 10,11,12,13,14) 0))
  )
(dato)

;conj argega un elemento al vector y regresa el nuevo vector
(defn append[]
  (println (conj (vector 3 4 5) 6))
  )
(append)

;pop regresa un vector sin el ultimo dato del vector
(defn eliminar[]
  (println(pop (vector  9 8 7 6 5)))
  )
(eliminar)


;subvec regresa un subvector de un vector con entrada y final como parametros

(defn subvector[]
  (println (subvec (vector 1 2 3 4 5 6 7) 2 5))
  ;(println (subvec (vector 1 2 3 4 5 6 7) 2 5))
  )
(subvector)




