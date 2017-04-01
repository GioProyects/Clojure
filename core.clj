(ns learning-closhur.core)

;suma
(defn suma-lista [list]
  (letfn [(
            adds [sumatoria lista]
            (if (empty? lista)
              sumatoria
              (adds (+ sumatoria (first lista)) (rest lista)))
            )]
    (adds 0 list)
    ))

(defn suma-vector [list]
  (letfn [(
            adds [sumatoria lista]
            (if (empty? lista)
              sumatoria
              (adds (+ sumatoria (first lista)) (rest lista)))
            )]
    (adds 0 list)
    ))

(defn suma-conjunto [list]
  (letfn [(
            adds [sumatoria lista]
            (if (empty? lista)
              sumatoria
              (adds (+ sumatoria (first lista)) (rest lista)))
            )]
    (adds 0 list)
    ))

(defn suma-mapa [list]
  (letfn [(
            adds [sumatoria lista]
            (if (empty? lista)
              sumatoria
              (adds (+ sumatoria ((first lista)1)) (rest lista)))
            )]
    (adds 0 list)
    ))


;multiplicacion
(defn multiplicacion-lista [list]
  (letfn [(
            multi [sumatoria lista]
            (if (empty? lista)
              sumatoria
              (multi (* sumatoria (first lista)) (rest lista)))
            )]
    (multi 1 list)
    ))


(defn multiplicacion-vector [list]
  (letfn [(
            multi [sumatoria lista]
            (if (empty? lista)
              sumatoria
              (multi (* sumatoria (first lista)) (rest lista)))
            )]
    (multi 1 list)
    ))
(multiplicacion-vector [1 2 3 4 5])


(defn multiplicacion-conjunto [list]
  (letfn [(
            multi [sumatoria lista]
            (if (empty? lista)
              sumatoria
              (multi (* sumatoria (first lista)) (rest lista)))
            )]
    (multi 1 list)
    ))
(multiplicacion-conjuntop #{1 2 3 4 5})


(defn multiplicacion-mapa [list]
  (letfn [(
            multi [sumatoria lista]
            (if (empty? lista)
              sumatoria
              (multi (* sumatoria ((first lista) 1)) (rest lista)))
            )]
    (multi 1 list)
    ))
(multiplicacion-conjuntop {:a 1 :b 2 :c 3 :d 4 :e 5})

;resta
(defn resta-lista [list]
  (letfn [(
            adds [sumatoria lista]
            (if (empty? lista)
              sumatoria
              (adds (- sumatoria (first lista)) (rest lista)))
            )]
    (adds 0 list)
    ))

(defn resta-vector [list]
  (letfn [(
            adds [sumatoria lista]
            (if (empty? lista)
              sumatoria
              (adds (- sumatoria (first lista)) (rest lista)))
            )]
    (adds 0 list)
    ))

(defn resta-conjunto [list]
  (letfn [(
            adds [sumatoria lista]
            (if (empty? lista)
              sumatoria
              (adds (- sumatoria (first lista)) (rest lista)))
            )]
    (adds 0 list)
    ))

(defn resta-mapa [list]
  (letfn [(
            adds [sumatoria lista]
            (if (empty? lista)
              sumatoria
              (adds (- sumatoria ((first lista)1)) (rest lista)))
            )]
    (adds 0 list)
    ))


;A B C D E F G H I J K L M N O P Q R S T U V W X Y Z Á É Í Ó Ú Ñ Ü

;de minusculas-a-mayusculas
(defn root-13 [cadena]
  (let [
        upper (fn [vocal]
                ({\A \N 
                  \B \O 
                  \C \P 
                  \D \Q 
                  \E \R 
                  \F \S 
                  \G \T 
                  \H \U
                  \I \V
                  \J \W
                  \K \X 
                  \L \Y
                  \M \Z
                  \N \A
                  \O \B
                  \P \C 
                  \Q \D
                  \R \E
                  \S \F 
                  \T \G
                  \U \H 
                  \V \I 
                  \W \J
                  \X \K
                  \Y \L
                  \Z \M} vocal)
                  )]
    (letfn [(r [cad result]
              (if (empty? cad)
                result
                (r (rest cad)
                   (str result (if (nil? (upper (first cad)))
                                 (first cad)
                                (upper (first cad))
                                )))
                )
                )]
      (r cadena "")
        )
    )
  )



(let [
      abc1 (fn [vocal]
             ({\a 1 \b 2 \c 3 \d 4 \e 5 
               \f 6 \g 7 \h 8 \i 9 \j 10 
               \k 11 \l 12 \m 13 \n 14 
               \o 15 \p 16 \q 17 \r 18 \s 19
               \t 20 \u 21 \v 22 \w 23 \x 24
               \y 25 \z 26 \á 27 \é 28 \í 29
               \ó 30 \ú 31 \ñ 32 \ü 33}vocal)
             )
      abc2 (fn [numero]
             ({1 \a 2 \b 3 \c 4 \d 5 \e 
               6 \f 7 \g 8 \h 9 \i 10 \j 
               11 \k 12 \l 13 \m 14 \n 
               15 \o 16 \p 17 \q 18 \r 19 \s
               20 \t 21 \u 22 \v 23 \w 24 \x 
               25 \y 26 \z 27 \á 28 \é 29 \í 
               30 \ó 31 \ú 32 \ñ 33 \ü}numero)
       )

      root-13 (fn [cadena]
                (letfn [(r [xs result]
                          (if (empty? xs)
                            result
                            (r (rest xs)
                               (str result                           
                                    (if (nil? (abc1 (first xs)))
                                      (first xs)
                                      (if (> (+ 13 (abc1 (first xs))) 33)
                                        (abc2 (- (+ 13 (abc1 (first xs))) 33))
                                        (abc2 (+ 13 (abc1 (first xs))))
                                        )
                                      ))
                               )
                            )
                          )]
                  (r cadena "")
                  )
                )
      unroot-13 (fn [cadena]
                  (letfn [(r [xs result]
                            (if (empty? xs)
                              result
                              (r (rest xs)
                                 (str result                           
                                      (if (nil? (abc1 (first xs)))
                                        (first xs)
                                        (if (< (- (abc1 (first xs)) 13) 1)
                                          (abc2 (+ (- (abc1 (first xs)) 13) 33))
                                          (abc2 (- (abc1 (first xs)) 13))
                                          )
                                        ))
                                 )
                              )
                            )]
                    (r cadena "")
                    )
                  )
      ]
  ;(root-13 "h--@o  2.3}l3}257a")
  ;(unroot-13 (root-13 "hola"))
  )









(let [sumatoria (fn [ys]
                  (letfn [(recursividad [xs acumulador]
                            (if (== (count xs) 0)
                              acumulador
                              (recursividad (rest xs) (+ acumulador (first xs)))))]
                    (recursividad ys 0)
                    ))]
  (sumatoria [1 2 3 4 5])
  )


;demostracion de que no hay asignacion
(let [x 10
      y (* 2 x)
      x 20
      z [x y]
      ]
  z)

;implementacion de count
(letfn [(conta [xs acumu]
          (if (empty? xs)
            acumu
            (conta (rest xs) (+ acumu 1))))]
  (conta '(1 2 3 4) 0)
  )





