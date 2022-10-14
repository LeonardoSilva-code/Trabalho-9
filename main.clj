;; Leonardo Silva de Abreu

(comment
  "1. Utilizando a linguagem Clojure, crie uma função chamada ultimo que receba uma lista e devolva o último elemento desta lista sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.")

(defn ultimo [x]
  (if (= (count x) 1) (first x)
      (ultimo (rest x))))

(comment
  "2. Utilizando a linguagem Clojure, crie uma função chamada penultimo que receba uma lista e devolva o penúltimo elemento desta lista usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.")

(defn penultimo [x]
  (if (= (count x) 2) (first x)
      (penultimo (rest x))))

(comment
  "3. Utilizando a linguagem Clojure, crie uma função chamada elementoN que receba uma lista e um inteiro N e devolva o elemento que está na posição N desta lista usar as funções já
prontas e disponíveis para esta mesma finalidade na linguagem Clojure.")

(defn elementoN [lista n]
  (if (= n 0) (first lista)
      (if (= lista []) nil
          (elementoN (rest lista) (- n 1)))))

(comment
  "4. Utilizando a linguagem Clojure, crie uma função chamada inverso que receba uma lista e
devolva esta lista com as posições dos elementos invertidas. Por exemplo recebe [1,2,3] e
devolve [3,2,1]. Sem usar as funções já prontas e disponíveis para esta mesma finalidade na
linguagem Clojure. ")
(defn inverso
  ([[x & xs]]
   (if (= (count xs) 0)
     (list x)
     (concat (inverso xs) (list x)))))

(comment
  "5. Utilizando a linguagem Clojure, crie uma função chamada mdc que receba dois inteiros e
devolve o mínimo divisor comum entre eles. Sem usar as funções já prontas e disponíveis
para esta mesma finalidade na linguagem Clojure. ")

(defn mdc [a b]
  (if (= b 0) a
    (mdc b (mod a b))
    )
  )

;;ultimo teste
(println "Func. ultimo; entrada: [1,2,3,4,5]; resultado: " (ultimo [1,2,3,4,5]))
(println "Func. ultimo; entrada: ['clojure','is','fun']; resultado: " (ultimo ["clojure","is","fun"]))


;;penultimo teste
(println "Func. penultimo; entrada: [1,2,3,4,5]; resultado: " (penultimo [1,2,3,4,5]))
(println "Func. penultimo; entrada: ['clojure','is','fun']; resultado: " (penultimo ["clojure","is","fun"]))

;;elementoN teste
(println "Func. elementoN; entrada: [1,2,3,4,5], 2; resultado: " (elementoN [1,2,3,4,5] 2))
(println "Func. elementoN; entrada: ['clojure','is','fun'], 0; resultado: " (elementoN ["clojure","is","fun"] 0))

;;inverso teste
(println "Func. inverso; entrada: [1,2,3,4,5]; resultado: " (inverso [1,2,3,4,5]))
(println "Func. inverso; entrada: ['clojure','is','fun']; resultado: " (inverso ["clojure","is","fun"]))

;;mdc teste
(println "Func. mdc; entrada: 70, 15; resultado: " (mdc 70 15))
(println "Func. mdc; entrada: 400, 320; resultado: " (mdc 400 320))


