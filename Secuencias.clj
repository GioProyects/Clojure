(ns learning-cloyure.Secuencias)

(def secu(seq [1 2 3 4 5 6]))

;cons Returns a new sequence where ‘x’ is the first element and ‘seq’ is the rest
(defn ejemplo[]
  (println (cons 0 secu))
  )
(ejemplo)


;conj Returns a new sequence where ‘x’ is the element that is added to the end of the sequence.

(defn ejemplo1 []
  (println (conj [1 2] 10))
  )
(ejemplo1)

;concat This is used to concat two sequences together.

(defn ejemplo2 []
  (println (concat [10 12] secu))
  )
(ejemplo2)


;distinct Se utiliza para garantizar que se añadan elementos distintos a la secuencia.

(defn ejemplo3 []
  (println (distinct [10 13 11 12 10 12]))
  )
(ejemplo3)

;reverse
(defn ejemplo4 []
  (println (reverse [9 8 7 6 5]))
  )
(ejemplo4)

;first
(defn ejemplo5 []
  (println (first [10 13 11 12 10 12]))
  )
(ejemplo5)

;last
(defn ejemplo6 []
  (println (last [10 13 11]))
  )
(ejemplo6)

;rest
(defn ejemplo3 []
  (println (rest [10 13 11]))
  )
(ejemplo3)

;sort Devuelve una secuencia ordenada de elementos.
(defn ejemplo3 []
  (println (distinct [10 13 11 12 10 12]))
  (println (distinct [10 9 2 19 43 1]))
  )
(ejemplo3)


;drop Suelta elementos de una secuencia basada en el número de elementos, que debe eliminarse.
(defn ejemplo3 []
  (println (drop 3 [10 13 11 12 10 12]))
  )
(ejemplo3)

;take-last Takes the last list of elements from the sequence.
(defn ejemplo3 []
  (println (take-last 3 [1 2 3 4 5]))
  )
(ejemplo3)

;take lo contrario a take-last
(defn ejemplo3 []
  (println (take 3 [1 2 3 4 5]))
  )
(ejemplo3)

;split-at
(defn ejemplo3 []
  (println (split-at 3 [1 2 3 4 5]))
  )
(ejemplo3)





