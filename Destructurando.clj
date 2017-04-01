 (ns Destructurando)

 (defn ejemplo []
   (def my-vec [1 2 3 4 5])
   (let [[a b c d e] my-vec]
     (println a b c d e)
     )
   )


(defn ejemplo []
  (def my-vec [1 2 3 4 5])
  (let [[a b c d e f] my-vec]
    (println a b c d e f)
    )
  )
(ejemplo)

;the-rest
;The ‘the-rest’ variable is used to store the remaining values, which cannot get assigned to any variable.
 (defn ejemplo []
   (def my-vec [1 2 3 4 5])
   (let [[a b & the-rest] my-vec]
     (println a b the-rest)
     )
   )




;Destructuring Maps
 (defn ejemplo []
   (def my-map {"a" 1 "b" 2})
   (let [{a "a" b "b"} my-map]
     (println a b)
     )
   )


(defn ejemplo []
  (def my-map {"a" 1 "b" 2})
  (let [{a "a" b "b" c "c"} my-map]
    (println a b c)
    )
  )
