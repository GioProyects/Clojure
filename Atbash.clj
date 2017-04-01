;explicacion del problema en la sig pagina web
;https://es.wikipedia.org/wiki/Atbash

(ns Atbash)

(defn atbash [xs]
  (let [abc (fn [carac]
              (case carac
                \a \z
                \b \y
                \c \x
                \d \w
                \e \v
                \f \u
                \g \t
                \h \s
                \i \r
                \j \q
                \k \p
                \l \o
                \m \ñ
                \n \n
                \ñ \m
                \o \l
                \p \k
                \q \j
                \r \i
                \s \h
                \t \g
                \u \f
                \v \e
                \w \d
                \x \c
                \y \b
                \z \a
                carac
                ))]
    (letfn [(repetir [cadena resultado]
              (if (empty? cadena)
                resultado
                (repetir (rest cadena) (conj resultado (abc (first cadena))))
                )
              )
            ]
      (repetir xs (vector))
      )
    )  
  )
(atbash "Hola") ;[\h \o \l \a])
