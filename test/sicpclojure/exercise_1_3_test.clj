(ns sicpclojure.exercise-1_3-test
  (:require [midje.sweet :refer :all]
            [sicpclojure.exercise-1_3 :refer :all]))

(fact (str "sum-squares-of-two-largest "
           "takes three numbers as arguments "
           "and returns the sum of the squares "
           "of the two larger numbers")
      (sum-squares-of-two-largest 0 0 0) => 0
      (sum-squares-of-two-largest 0 1 0) => 1
      (sum-squares-of-two-largest 1 0 1) => 2
      ;(sum-squares-of-two-largest 1 0 2) => 5
      )
