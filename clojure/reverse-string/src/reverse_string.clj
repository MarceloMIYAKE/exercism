(ns reverse-string)

(defn reverse-string [s]
  ;; Solution 1
  ;; (clojure.string/join (reverse s))

  ;; Solution 2
  (clojure.string/join (reduce conj '() s)))
