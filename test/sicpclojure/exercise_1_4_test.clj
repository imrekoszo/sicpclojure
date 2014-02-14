(ns sicpclojure.exercise-1_4-test
  (:require [midje.sweet :refer :all]))

(defn a-plus-abs-b [a b]
  ((if (> b 0) + -) a b))

(fact "a-plus-abs-b"
      (a-plus-abs-b 0 0) => 0
      (a-plus-abs-b 0 1) => 1
      (a-plus-abs-b 0 -1) => 1
      (a-plus-abs-b -345 -45) => -300
      (a-plus-abs-b -345 45) => -300
      (a-plus-abs-b 345 -45) => 390
      (a-plus-abs-b 345 45) => 390
      )
