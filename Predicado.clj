 (ns Predicado)

 (defn ejemplo []
   (def x (even? 0))
   (println x)

   (def x (neg? 2))
   (println x)

   (def x (odd? 3))
   (println x)

   (def x (pos? 3))
   (println x)
   )


;every-pred
;Takes a set of predicates and returns a function ‘f’ that returns true if all of its
; composing predicates return a logical true value against all of its arguments, else it returns false.
 (defn ejemplo []
   (println ((every-pred number? even?) 2 4 6))
   (println ((every-pred number? odd?) 2 3 6))
   )


;every?
;Returns true if the predicate is true for every value, else false.
 (defn ejemplo []
   (println (every? even? '(2 4 6)) )
   (println (every? odd? '(2 4 6)) )
   )


;some
;Returns the first logical true value for any predicate value of x in the collection of values.
 (defn ejemplo []
   (println (some even? '(1 2 3 4 5)))
   (println (some #(= 5 %) '(1 2 3 4 5)))
   )


;not-any?
;Returns false if any of the predicates of the values in a collection are logically true, else true.
 (defn ejemplo []
   (println (not-any? even? '(2 4 6)))
   )
(ejemplo)