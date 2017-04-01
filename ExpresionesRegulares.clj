 (ns ExpresionesRegulares)


;re-pttern
;Returns an instance of java.util.regex.Pattern. This is then used in further methods for pattern matching.

 (defn ejemplo []
   (def pat (re-pattern "\\d+"))
   )
;(ejemplo)

;re-find
;Returns the next regex match, if any, of string to pattern, using java.util.regex.Matcher.find()
 (defn ejemplo []
   (def pat (re-pattern "\\d+"))
   (println (re-find pat "abc123de"))
   )


;replace
;The replace function is used to replace a substring in a string with a new string value.
;The search for the substring is done with the use of a pattern.
 (defn ejemplo []
   (def pat (re-pattern "\\d+"))
   (def newstr (clojure.string/replace "abc123de" pat "789"))
   (println newstr)
   )


;replace-first
;The replace function is used to replace a substring in a string with a new string value, 
; but only for the first occurrence of the substring. The search for the substring is done with the use of a pattern.
 
 (defn ejemplo []
   (def pat (re-pattern "\\d+"))
   (def newstr1 (clojure.string/replace "abc123deswx123xedw123" pat "789"))
   (def newstr2 (clojure.string/replace-first "abc123de123" pat "789"))
   (println newstr1)
   (println newstr2)
   )
 (ejemplo)