(ns sicpclojure.exercise-1_5-test
  (:require [midje.sweet :refer :all]))

(defn p [] (p))

(defn do-test [x y]
  (if (zero? x) 0 y))

(fact "clojure uses applicative order evaluation, so this call will overflow the stack"
      (do-test 0 (p)) => (throws StackOverflowError))
