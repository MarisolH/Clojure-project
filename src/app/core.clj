(ns app.core
  (:gen-class));;indica los parametros del archivo project.clj

(defn foo  [x] (println x "Hello, World!"))
;;(foo "main!"));;main en clojure
;---;;Fibonacci;---;;
(defn fibonacci [x]
  (if(<= x 1) 1
     (+ (fibonacci (- x 2)) (fibonacci (- x 1)))))

;!(1)= (* 1)
;!(2)= (* 1 2)
;!(3)= (* 1 2 3)
(defn factorial [x]
  (if (= x 1) 1
      (* (factorial (x - 1) x)))
  )

  (defn -main [& args]
    (let [arg-1 (or(first args) "0")
          n (Integer/parseInt arg-1)]
          (println "fib("n")=" (fibonacci n))
          (println "!("n")=" (factorial n))))
