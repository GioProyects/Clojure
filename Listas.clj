(ns learning-cloyure.Listas)

(defn ejemplo []
  (def xa (list 1 2 3 4 5))
  (println xa)
  (println (list "a" "b" "c" "d"))
  )
;(ejemplo)


;list*  List is a structure used to store a collection of data items. 
;In Clojure, the List implements the ISeq interface. 
;Lists are created in Clojure by using the list function.
(defn lista1 []
  (println (list* 1 [2,3])))
;(lista1)

;first
(defn primero [lst]
  (println (rest lst))
  (println lst)
  )
(primero '(1 2 3 4 5))

;nth
(defn posicion []
  (def li (list 1 2 3 4 5)) 
  (println (nth (list 1 2 3 4 5) 3))
  (println (nth (list 1 2 3 4 5) 4)))
 ; (posicion)

;cons  Returns a new list wherein an element is added to the beginning of the list.
(defn lista2 []
  (def lista (cons 0 (list 1 2 3)))
  (println lista))
;(lista2)


;conj
(defn conjunto []
  (println (conj '(1 2 3 4 5 6 7 8 9 ) 4 5)))
;(conjunto)

;rest
(defn resto []
   (println(rest (list 1 2 3 4 5)))
  )  
;(resto)








