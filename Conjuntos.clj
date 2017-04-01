(ns learning-cloyure.Conjuntos
  (:require [clojure.set :as set])
)
;conjunto de valores unicos

(def co (set '(1 2 3 4 5)))


;sorted-set (conjunto ordenado)
(defn ordenado[]
  (println(sorted-set 94 2 5 2 6 4)))
(ordenado)

;get devuelve un elemento en una posicion
(defn devuelve[]
  (println (get co 4))
  (println (get (set '(3 6 2 4 3 2)) 1))
  )
(devuelve)


;contains? busca si el conjunto tiene un determinado conjunto o no
(defn buscar[]
  (println (contains? co 6))
  (println (contains? (set '( 6 2 6 2 6)) 1))
  )
(buscar)

;conj agrega un nuevo elemento al conjunto y retorna un nuevo conjunto con ese elemento
(defn agregar [ind]
   (println (conj (set '(3 2 1)) 5))
   (println (conj co ind))
   )
(agregar 6)


;disj quita un elemento del conjunto

(defn eliminar[]
  (println (disj (set '(1 2 3)) 2))
  (println (disj co 3))
  )
(eliminar)



;union une dos conjuntos 
;nota: hay que importar la clase clojure.set a la clase para poder utilizarlo
;(:require [clojure.set :as set])
(defn unir[]
  (println (set/union co #{100 200}))
  (println (set/union #{10 11 12} #{20 21 22 23}))
  )
(unir)


;difference Devuelve un conjunto que es el primer conjunto sin elementos de los conjuntos restantes.
;tambien requiere la clase clojure.set
(defn diferencia[]
  (println (set/difference #{1 2} #{3 1}))
  (println (set/difference #{100 200} co))
  )
(diferencia)


;intersection regresa un conjunto que es la interseccion de dos conjuntos
;tambien requiere la clase clojure.set
(defn interseccion[]
  (println (set/intersection co #{5 6 2 7 1}))
  (println (set/intersection #{ 1 2 3 4} #{5 6 2 7 1}))
  )
(interseccion)


;subset? es conjunto1 subconjunto de conjunto2?
;tambien requiere la clase clojure.set
(defn subconjunto[]
  (println(set/subset? #{1 2} #{2 3}))
  (println (set/subset? #{2 3 4} co))
  )
(subconjunto)


;superset? es conjunto1 un superconjunto de conjunto2?
;tambien requiere la clase clojure.set
(defn super_conjunto[]
  (println (set/superset? #{1 2} #{1 2 3}))
  (println (set/superset? co #{1 2 3}))
  )
(super_conjunto)

