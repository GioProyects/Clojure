(ns learning-cloyure.Funciones
  (:gen-class))

;funcion simple=================
(defn ejemplo []
 (def x 1)
 (def y 1.43)
 (def cadena "Hola mundo")
 (println x)
 (println y)
 (println cadena)
 )
;==============================
 
 
 ;funcion anonima================
(defn ejemplo []
  ((fn [x] (* 2 x))*2))
;===============================





;funcion con multiples argumentos================
(defn demo [] (* 2 2))
(defn demo [x] (* 2 x))
(defn demo [x y] (* 2 x y))
;================================================






;funcion variadic================
;Variadic functions are functions that take 
;varying number of arguments (some arguments are optional). 
;Function can also specify the ‘&’ 
;ampersand symbol to take in an arbitrary number of arguments.
(defn demo
  [message & others]
  (str message (clojure.string/join " " others)))
;If you invoke the above function as
(demo "hola" "esto" "es" "un" "mensaje")



;funciones de orden superior================================
;Higher-order functions (HOFs) are functions that take other functions as arguments. 
;HOFs are an important functional programming technique and are quite commonly used in Clojure. 
;One example of an HOF is a function that takes a function and a collection and returns
;a collection of elements that satisfy a condition (a predicate). 
;In Clojure, this function is called clojure.core/filter

(filter even? (range 0 10))
;===========================================================


(ejemplo)