(ns com.gadawski.maven-test.source-a-test
 (:use clojure.test)
 (:import com.gadawski.maven.test_project.JavaClass)
 (:use com.gadawski.maven-test.source-a))

(deftest clj-test-a-greater-b-1
  (is (= (get-greater-param 1 2) 2)))

(deftest clj-test-a-greater-b-2
  (is (= (get-greater-param 2 1) 2)))

(deftest clj-test-a-less-b
  (is (= (get-less-param 2 1) 1)))

