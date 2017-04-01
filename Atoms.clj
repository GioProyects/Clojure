 (ns Atoms)

 (defn ejemplo []
   (def myatom (atom 10))
   (println @myatom)
   )



;reset!
;Sets the value of atom to a new value without regard for the current valu.      e.
 
 (defn ejemplo []
   (def myatom (atom 1))
   (println @myatom)
   (reset! myatom 3)
   (println @myatom)
   )



;compare-and-set
(defn ejemplo []
  (def myatom (atom 1))
  (println @myatom)
  (compare-and-set!  myatom 0 3)
  (println @myatom)
  (compare-and-set!  myatom 1 3)
  (println @myatom)
  )


;swap!
(defn example []
  (def myatom (atom 1))
  (println @myatom)

  (swap! myatom inc)
  (println @myatom))
(example)