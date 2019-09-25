(ns armstrong-numbers)

(defn pow
  [base power]
  (reduce * (repeat power base)))

(defn armstrong? [num]
  (let [bases (str num)
        power (count bases)]
    (def result (->> bases
                     (map #(pow (read-string (str %)) power))
                     (reduce +)))
    (= result num)))

