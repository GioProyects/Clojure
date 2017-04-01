(ns DateandTime
  (:import (java.text SimpleDateFormat)
           (java.util Date)))

;java.util.Date
 (defn ejemplo []
   (def date (.toString (java.util.Date.)))
   (println date)
   )

;java.text.SimpleDateFormat
 (defn ejemplo []
   (def date (.format (SimpleDateFormat. "MM/dd/yyyy") (new Date)))
   (println date)
   )



;getTime
(defn ejemplo []
  (def date (.getTime (Date.)))
  (println date)
  )
(ejemplo)