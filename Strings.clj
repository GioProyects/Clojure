(ns learning-cloyure.Strings)

(defn hola-mundo []
  (println "hola mundo")
  (println "como esttan vatos"))
(hola-mundo)




;str
(defn hola []
  (println (str "hola" " mundo"))
  (println (str "hola" " mundo" " otra ves"))
)(hola)


;format
(defn formato []
  (println (format "hola, %s" "mundo"))
  (println (format "pad with leading zeros %06d" 1234))
  )(formato)


;count
(defn cuenta []
  (println (count "hola perro")))(cuenta)


;substrings
(defn substring []
  (println (subs "hola mundo" 2 6))
  (println (subs "hola mundo" 5 7)))(substring)


;compare
(defn comparar []
  (println (compare "Hola" "hola"))
  (println (compare "Hola" "Hola"))
  )(comparar)


;minusculas
(defn minusculas []
  (println (clojure.string/lower-case "HoLAmunDO"))
  (println (clojure.string/lower-case "HOLAMUNDO")))(minusculas)

;mayusculas
(defn minusculas []
  (println (clojure.string/upper-case "HoLAmunDO"))
  (println (clojure.string/upper-case "HOLAMUNDO")))(minusculas)

;join
(defn union []
  (println (clojure.string/join "," [1 :a 3 :r :d 2 :g 5 :d 4 2])))(union)


;split
(defn separar [];[cadena & others]
  (println (clojure.string/split "h\nol\na\nmun\nd\no" #"\n"))
  ;(println (clojure.string/split (str cadena (clojure.string/join " "  others))  #"\n"))
  )(separar)
;(println (separar "Hola\nmundo\nComo\nEstas\n!!"))

;split-lines
(defn separar-lineas []
  (println (clojure.string/split-lines "Hola\nMundo")))(separar-lineas)

;reverse
(defn reversa []
  (println (reverse "Hola Mundo")))(reversa)


;replace
(defn reemplazo []
  (println (clojure.string/replace "tutorial sobre Java" #"Java" "Clojure" )))(reemplazo)


;trim
(defn sin-espacios []
  (println (clojure.string/trim "sin espacios ")))(sin-espacios)

;triml
(defn sin_espaciosm []
  (println (clojure.string/triml "        hola mundo      sdfsdf         ")))(sin_espaciosm)

;trimr

(defn sin_espaciosr []
  (println (clojure.string/trimr "   sin espacios   ")))(sin_espaciosr)







