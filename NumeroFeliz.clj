 (ns NumeroFeliz)

;descripcion del problema en el sig enlace
;http://www.solveet.com/exercises/El-numero-feliz/73
;Los primeros números felices hasta el 100 son el
;1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97 y 100.

((defn feliz? [numero]
   (let [ 
         mayor? (fn [x] (if (>= x 100) true false))
         cuadrado (fn [x] (* x x))
         suma (fn [x y] (+ x y))
         suma2 (fn [x y z] (+ x y z))
         division1_centenas (fn [x] (quot x 100))
         division2_decenas (fn [x] (quot (mod x 100) 10))
         division3_unidades (fn [x] (mod x 10))
         respuesta1 (fn [a b] (conj (vector) a b))
         respuesta (fn [a b c] (conj (vector) a b c))
         ]
     (letfn [(repetir [num conta]
                    (if (= num 1)
                      true
                      (if (= conta 0)
                        false
                        (if (mayor? num)
                          (repetir (suma2 (cuadrado (division1_centenas num))
                                          (cuadrado (division2_decenas num))
                                          (cuadrado (division3_unidades num))
                                          )
                                   (dec conta))
                          (repetir (suma (cuadrado (division2_decenas num))
                                         (cuadrado (division3_unidades num))
                                         )
                                   (dec conta))
                          )
                        )
                      )
                    )]
       (repetir numero 20)
       )
     )
   )45)

