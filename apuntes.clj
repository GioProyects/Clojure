(ns learning-closhur.apuntes)

;funciones anonimas
((fn [x]
   (if (odd? x)
     (inc x)
     (dec x))
   )10)



;funcion aridad multiple
(defn el-siguiente 
  ([] 0)
  ([x] (inc x))
  ([x y] (inc (max x y)))
  ([x y z] (inc (max x y z)))
  )
(el-siguiente 10 11 9)


;funcion de orden superior
(((fn [f]
    (fn [x]
      (if (f x)
        (vector (dec x) (inc x))
        (vector)
        )
      )
    )pos?)34)

;bindings

;defn
(defn antecesor [x]
  (dec x))

(defn sucesor [x]
  (inc x))

(defn anterior-siguiente [num]
  (hash-map :anterior (antecesor num)
           :siguiente (sucesor num)
           )
  )
(anterior-siguiente 19)


;let
(defn siguiente-anterioro [num]
  (let [siguiente (fn [num] (inc num))
        anterior (fn [num] (dec num))
        resultado (fn [x y] (hash-map :anterior x
                                      :siguiente y))]
    (resultado (anterior num)
               (siguiente num))
    )
  )
(siguiente-anterioro 12)

;condicionales

(defn estacion-año [mes]
  (let [estaciones (hash-map :primavera #{:marzo :abril :mayo}
                             :verano #{:junio :julio :agosto}
                             :otoño #{:septiembre :octubre :noviembre}
                             :invierno #{:diciembre :enero :febrero})]
    (cond
      ((estaciones :primavera)mes) :primavera
      ((estaciones :verano)mes) :verano
      ((estaciones :otoño)mes) :otoño
      ((estaciones :invierno)mes) :invierno
      )
    )
  )
(estacion-año :febrero)

;case
(defn siguiente-dia [a]
  (case a
    :lunes :martes
    :martes :miercoles
    :miercoles :jueves
    :jueves :viernes
    :viernes :sabado
    :sabado :domingo
    :domingo :lunes
    )
  )
(siguiente-dia :viernes)


;recursividad
(defn producto-de [x y]
  (if (zero? x)
    0
    (+ y (producto-de y (dec x)))
    )
  )
(producto-de 3 100)

:letfn
(defn producto-de [x y]
  (letfn [(sumatoria [inicio fin sumando total]
            (if (= inicio fin)
              total
              (sumatoria (inc inicio) fin sumando (+ sumando total)))
            )]
    (sumatoria 0 x y 0)
    )
  )
(producto-de 4 3)


(defn suma-numeros-en [vector]
  (letfn [(sumatoria [inicio fin secuencia total]
            (if (= inicio fin)
              total
              (sumatoria (inc inicio) fin (rest secuencia) (+ (first secuencia) total)))
            )]
    (sumatoria 0 (count vector) vector 0)
    )  
  )
(suma-numeros-en (vector 1 2 3 4 5 6))


;suma de numeros en una lista
(let [suma (fn [xs]
             (letfn [(r [as acc]
                       (if (empty? as)
                         acc
                         (r (rest as) (+ acc (first as))
                            )
                         )
                       )
                     ]
               (r xs 0)
               )
             )
      ]
  (suma '(5 4 6 2 5 2))
  )


;cadenas

;first y rest
(let [cadena "123"]
  (list (first cadena) (rest cadena))
  )


;last y butlast
(let [mapa {:a 10 :b 20 :c 30}]
  (list (last mapa) (butlast mapa))
  )

(let [mapa {:a 10 :b 20}]
  (list (last mapa) (butlast mapa))
  )

;suma de numeros en un conjunto
(let [suma (fn [xs]
             (letfn [(sumatoria [conjunto total]
                       (if (empty? conjunto)
                         total
                         (sumatoria (rest conjunto) (+ total ((first conjunto) 1)))
                         )
                       )
                     ]
               (sumatoria xs 0)
               )
             )
      ]
  (suma {:a 10 :b 20 :c 30})
  )

;explicacion del porque le se pone
;((first conjunto)1)
(let [primero (fn [conjunto]
                ((first conjunto)1))]
  (primero {:a 10 :b 20 :c 30})
  )


;funciones de orden superior

;apply
(defn los-primeros [xs ys]
  (vector (first xs) (first ys))
  )
(apply los-primeros [[30 20] [50 60]])


;map

(map (fn [numero]
       (* 2 numero))
     [2 4 6 8]
     )

(map (fn [nombre]
       (str "Hola " nombre))
     ["a" "b" "c"]
     )

;filter

(defn mayor_10_y_menor_20
  [xs]
  (and (> xs 10) (< xs 20))
)

(filter mayor_10_y_menor_20 [1 2 11 12])

(defn un_elemento
  [xs]
  (= (count xs) 1)
  )
(filter un_elemento [[1 2 3] [1] [2 3] [5] [9 8 6]])

;reduce
(reduce (fn
          ([] 0)
          ([x y] (+ x y))
          )
        [90 100 70]
        )

(reduce (fn
          ([] #{})
          ([conjunto elemento] (conj conjunto elemento))
          )
        #{} [[1 2] [3] [4 5] [3]]
        )
(reduce (fn
          ([mapa numero]
            (conj mapa [numero (inc numero)])
            )
          )
        {} [1 2 3 4 5]
        )




