(ns sicpclojure.exercise-1_2-test
  (:require [midje.sweet :refer :all]))

(fact "We can write complex prefix expressions"
      (/ (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 3)))))
         (* 3 (- 6 2) (- 2 7)))
      =>
      (- 23/90)
      )
