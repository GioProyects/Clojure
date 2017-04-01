(ns plf.SeguroSocial)

(def numero 3090682493)

(let [
      tamanio_numero(fn [x]
                      (letfn [(longitud [numero longitud-numero]
                                (if (<= numero 0)
                                  longitud-numero
                                  (longitud (quot numero 10) (inc longitud-numero)))
                                )]
                        (longitud x 0)
                        ))
      numero-a-lista (fn [x] 
                       (letfn [(re [numero lista mult]
                                 (if (<= numero 0)
                                   lista
                                   (if (= mult 2)
                                     (re (quot numero 10) 
                                          (conj lista (* 2 (mod numero 10)))
                                          ((dec mult)))
                                     (re (quot numero 10)
                                          (conj lista (* 1 (mod numero 10)))
                                          (inc mult)
                                          )
                                     )
                                   )
                                 )]
                         (re 3040506070 '() 1)
                         )
                      )      
      ]
  ;(tamanio_numero numero)
  (numero-a-lista numero)
  )      
