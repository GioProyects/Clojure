(ns learning-cloyure.Mapas
  (:require [clojure.set :as set])
  )

;Un mapa es una colección que asigna claves a los valores. 
;Se proporcionan dos tipos diferentes de mapas: hash y ordenados. 
;HashMaps requieren claves que soportan correctamente hashCode y son iguales.
;SortedMaps requieren claves que implementan Comparable o una instancia de Comparator.

;hasmap
(defn hashmap[]
  (println "HashMap")
  (def demokey (hash-map "z" "1" "b" "2" "a" "3"))
  (println demokey)
  )
(hashmap)

;sortedmap
(defn sortedmap[]
  (println "SortedMap")
  (def demokey (sorted-map "z" "1" "b" "2" "a" "3"))
  (println demokey)
  )
(sortedmap)

(def demokey (hash-map "z" "1" "b" "2" "a" "3"))

;maps get Returns the value mapped to key, not-found or nil if key is not present.

(defn obtener[]
  ;(def demokey (hash-map "z" "1" "b" "2" "a" "3"))
  (println demokey)
  (println (get demokey "b"))
  )
(obtener)

;maps contains? See whether the map contains a required key

(defn contiene[]
  ;(def demokey(hash-map "z" "1" "b" "2" "a" "3"))
  (println (contains? demokey "b"))
  (println (contains? demokey "x"))
  )
(contiene)

;map find Returns the map entry for the key.
(defn encontrar[]
  ;(def demokey(hash-map "z" "1" "b" "2" "a" "3"))
  (println (find demokey "z"))
  (println (find demokey "3"))
  )(encontrar)


;maps key Returns the list of keys in the map.
(defn llave[]
  (println (keys demokey))
  ) 
(llave)

;maps vals Returns the list of values in the map.
(defn valores[]
  (println (vals demokey))
  )
(valores)

;maps dissoc Dissociates a key value entry from the map.
(defn desasociar[]
  (println (dissoc demokey "b"))
  )
(desasociar)

;maps merge une dos mapas en uno solo 
(defn unir[]
  (def demokeys (hash-map "z" 1 "h" 2 "a" 3))
   (def demokeys1 (hash-map "a" 2 "h" 5 "i" 7))
   (println (merge-with + demokeys demokeys1)));se puede utilizar el -,*,/
(unir)

;maps select-keys Returns a map containing only those entries in map whose key is in keys.
(defn sele_llaves[]
  (println(select-keys demokey ["z" "a"]))
  )
(sele_llaves)

;maps rename_key  Renames keys in the current HashMap to the newly defined ones.
;requiere la libreria clojure.set (:require [clojure.set :as set])
(defn renombrar_llave[]
  (def demokey(hash-map "z" 1 "b" 2 "a" 3))
  (def demonew (set/rename-keys demokey {"z" "newz" "a" "newa"}))
  (println demonew)
  )
(renombrar_llave)

;map map-invert Inverts the maps so that the values become the keys and vice versa.
(defn invertir[]
  (def demokey(hash-map "z" 1 "b" 2 "a" 3))
  (def demonew (set/map-invert demokey))
  (println demonew)
  )
(invertir)




