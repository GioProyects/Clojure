(ns ejercicios-clojure.core)


;Definir la función ultimaCifra tal que (ultimaCifra x)es la última cifra del número x
;. Por ejemplo,
;ultimaCifra 325==5
(defn ultimaCifra [x]
  (rem x 10))
;(ultimaCifra 526)


;Definir la función maxTres tal que (maxTres x y z)es el máximo de x,y y z.
(defn maxTres[x y z]
  (max x(max y z))
  )
;(maxTres 198989 24134 213)

;Definir la función rota1 tal que (rota1 xs) es la lista obtenida poniendo el
;primer elemento de xs al final de la lista.

(defn rota1[xs]
  ;(list* (rest xs) (first xs))
  (conj (rest xs) (list(first xs)))
  )
;(rota1 '(1 2 3 4 5))

;Definir la función rota  tal que (rota n xs) es la lista obtenida poniendo los n
;primeros elementos de xs al final de la lista.

;rota 1 [3,2,5,7]==[2,5,7,3]
;rota 2 [3,2,5,7]==[5,7,3,2]
(defn rota [ind lst]
  (loop [i 0
         l lst
         ]
    (let [dato (first l)]
    (if (= i ind)
      l
      (recur (inc i) (conj (vec(rest l)) dato))
      )      
    )
  )
)
;(println(rota 2 '(3 2 5 7)))

;Definir la función rango tal que (rango xs) es la lista formada por el menor
;y mayor elemento de xs . Por ejemplo,
;rango [3,2,7,5]== [2,7]
(defn rango [lista]
  (println (str "minimo:"(apply min lista) "\nmaximo:"(apply max lista)))
  )
;(rango '(123 2134 345 1254 1234 134))


;Definir la función palindromo tal que (palindromo xs) se verifica si xs es
;un palíndromo; es decir, es lo mismo leer xs de izquierda a derecha que de derecha a izquierda.
;Por ejemplo,
;palindromo [3,2,5,2,3]== True
;palindromo [3,2,5,6,2,3] == False

(defn palindromo [cad]
  (let [pali (reverse cad)
        norm cad]
    (if (= pali norm)
      true
      false)
    )
  )
;(println(palindromo [3,2,5,2,3]))

;Definir la función interior tal que (interior xs) es la lista obtenida eli-
;minando los extremos de la lista xs . Por ejemplo,
;interior [2,5,3,7,3] == [5,3,7]
;interior [2..7]== [3,4,5,6]

(defn interior [xs]
  
  (println (subvec (vec xs) 1 (- (count xs) 1)))
  )
;(interior '(43 3 5 2 5 5 3 5 2 2 24 ))


;Definir la función finales tal que (finales n xs) es la lista formada por
;los n finales elementos de xs . Por ejemplo,
;finales 3 [2,5,4,7,9,6]==[7,9,6]

(defn finales [n lst]
  (subvec lst n)
  )
;(println(finales 3 [2,5,4,7,9,6]))

;Definir la función segmento tal que (segmento m n xs) es la lista de los
;elementos de xs comprendidos entre las posiciones m y n . Por ejemplo,
;segmento 3 4 [3,4,1,2,7,9,0] == [1,2]
;segmento 3 5 [3,4,1,2,7,9,0] == [1,2,7]
;segmento 5 3 [3,4,1,2,7,9,0] == []

(defn segmento [m n lst]
  (if (> m n)
    []
    (subvec lst (dec m) n)
    )
  )
(def seg (segmento 5 3 [3,4,1,2,7,9,0]))
;(println seg)


;Definir la función extremos tal que (extremos n xs) es la lista formada
;por los n primeros elementos de xs y los n finales elementos de xs . Por ejemplo,
;extremos 3 [2,6,7,1,2,4,5,8,9,2,3]==[2,6,7,9,2,3]

(defn extremos [n lst]
  (concat (subvec lst 0 n) (reverse (subvec (vec (reverse lst )) 0 n)))
  )
(def extr (extremos 5 [2,6,7,1,2,4,5,8,9,2,3]))
;(println extr)

;Definir la función mediano tal que (mediano x y z) es el número mediano
;de los tres números x , y y z . Por ejemplo,
;mediano 3 2 5 == 3
;mediano 2 4 5 == 4
;mediano 2 6 5 == 5
;mediano 2 6 6 == 6

(defn mediano [x y z]
  (def ordenado (sort [x y z]))
  (nth ordenado (mod (count ordenado) 2))
  )
(def med (mediano 3 2 5))
;(println med)

;Definir la función tresIguales tal que (tresIguales x y z) se verifica si
;los elementos x , y y z son iguales. Por ejemplo,
;tresIguales 4 4 4==True
;tresIguales 4 3 4==False

(defn tresIguales [x y z]
  (if (= y z)
    (if (= x y)
      (if (= x z)
        true
        false
        )
      false
      )
    false
    )
  )
(def igual (tresIguales 1 8 8))
;(println igual)

;Definir la función tresDiferentes tal que (tresDiferentes x y z) se
;verifica si los elementos x , y y z son distintos. Por ejemplo,
;tresDiferentes 3 5 2 ==True
;tresDiferentes 3 5 3 ==False
(defn tresDiferentes
  "funcion que verifica si son diferentes"
  [x y z]
  (if (not= y z)
    (if (not= x y)
      (if (not= x z)
        true
        false
        )
      false
      )
    false
    )
  )
(def dife (tresDiferentes 2 3 1))
;(println dife)

;Definir la función cuatroIguales tal que (cuatroIguales x y z u) se
;verifica si los elementos x , y , z y u son iguales. Por ejemplo,
;cuatroIguales 5 5 5 5==True
;cuatroIguales 5 5 4 5==False
;Indicación: Usar la función tresIguales .
(defn cuatroIguales [x y z u]
  (if (= x y)
    (if (tresIguales y z u)
      true
      false
      )
    false
    )
  )
(def cuatroIgu (cuatroIguales 1 5 5 5))
;(println cuatroIgu)


;Las longitudes de los lados de un triángulo no pueden ser cualesquiera. Para
;que pueda construirse el triángulo, tiene que cumplirse la propiedad triangular; es decir, longitud
;de cada lado tiene que ser menor que la suma de los otros dos lados.
;Definir la función triangular tal que (triangular a b c) se verifica si a , b y c complen
;la propiedad triangular. Por ejemplo,
;triangular 3 4 5 == True
;triangular 30 4 5 == False
;triangular 3 40 5 == False
;triangular 3 4 50 == False
(defn triangular [a b c]
  (if (< a (+ b c))
    (if (< b (+ a c))
      (if (< c (+ a b))
        true
        false
        )
      false
      )
    false
    )
  )
(def tria (triangular 5 67 8))
;(println tria)

;Definir la función divisionSegura tal que (divisionSegura x y) es
;y no es cero y 9999 en caso contrario. Por ejemplo,
;divisionSegura 7 2==3.5
;divisionSegura 7 0==9999.0
(defn division [x y]
  (if (= y 0)
    (throw (Exception.   "9999.0"))
    (quot x y)
    )
  )
(def div (division 7.0 0))
(println div)











;-------------OTROS EJEMPLOS DE AYUDA-------------
(defn suma_final [vect]
  (reduce + (subvec (vec vect) (- (count vect) 2) (count vect)))
  )
(suma_final [1 2])


;fibonacci
(defn fibo [x]
  (loop [start [0 1]]
    (if (>= (count start) x)
      start
      (recur (conj start (+ (inc (last start)) (dec (last (pop start))))))
      )
    )  
  )
;(fibo 40)


;factor primo mayor
(defn factor_primo [x]
  (filter #(loop [inicio [2 3 5 7]
                  temp 0])
             ;(if())) (filter odd? (range x))
          )
  )
;(factor_primo 13195) 



(defn palindrome?
  [n]
  (let [reversed (apply str (reverse (str n)))
        strn (str n)]
    (if(= reversed strn)
        true
        false)))
;(def pal (palindrome? "anitalavalatina"))
;(println pal)

