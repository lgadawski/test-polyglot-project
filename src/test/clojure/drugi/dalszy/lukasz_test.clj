(ns drugi.dalszy.lukasz-test
 (:use clojure.test)
 (:use pierwszy.kolejny.lukasz))

(run-all-tests)

(deftest add-x-to-y
  (is (= 5 (+ 2 3))))
  
 (deftest minus-d-2
 	(is (= 4 (- 10 6))))
 
 (deftest test-a-plus-b
   (is (= 5 (aplusb 2 3))))
 
 (deftest test-a-plus-b2
   (is (= -8 (aplusb -10 2))))
 
 (deftest test-foo 
   (is (= 2 (+ 1 1)))
   (main))
 