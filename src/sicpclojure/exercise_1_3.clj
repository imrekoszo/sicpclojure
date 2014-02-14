(ns sicpclojure.exercise-1_3)

(defn- square [x]
  (* x x))

(defn sum-squares-of-two-largest [& args]
  (apply + (map square (take 2 (sort > args)))))