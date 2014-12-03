(ns pierwszy.kolejny.lukasz
  (:gen-class 
    :name lukasz
    :methods [#^{:static true} [aplusb [int int] int]]))

;'(set! *print-level* true)
;(set! *stack* false) ;; unable to resolve symbol: *stack* in this context
;(set! *warn-on-reflection* true) ;; Can't change/establish root binding of: *warn-on-reflection* with set

(defn aplusb
  "Calculates a+b"
  [a b & args]
  (+ a b))

(defn main [& args]
  (println "Hello cruel world from clojure extra file!")
  (println (str "(aplusb 100 200): " (aplusb 100 200)))
  (println (str "(aplusb 200 200): " (aplusb 200 200)))
  (println "End of testing.")
  (println "**********"))