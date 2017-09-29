(ns algorithm-design-manual.chapter1-test
  (:use midje.sweet)
  (:require [algorithm-design-manual.chapter1 :refer :all]))

(facts "test insertion sort"
  (fact "sort a descending list"
    (insertion-sort [ 9 8 7 6 5 4 3 2 1]) => [ 1 2 3 4 5 6 7 8 9 ] )
  (fact "empty list"
    (insertion-sort []) => [])
  (fact "one element list"
    (insertion-sort [1]) => [1])
  (fact "two element list"
    (insertion-sort [2 1]) => [1 2])
  (fact "sorted 3 element list"
    (insertion-sort [ 1 2 3]) => [ 1 2 3])
  (fact "mixed elements "
    (insertion-sort [9 6 8 7 3 5 4 2 1 0 -1 ]) => [ -1 0 1 2 3 4 5 6 7 8 9]))
