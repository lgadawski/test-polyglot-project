(ns com.gadawski.maven-test.source-a
  (:use clojure.test)
  (:import com.gadawski.maven.test_project.JavaClass))

(defn get-greater-param [a b]
  (if (JavaClass/checkParamAGreaterThanB a b) a b))

(defn get-less-param [a b]
  (if (JavaClass/checkParamALessThanB a b) a b))
  
(defn get-less-or-equal-param [a b]
  (if (JavaClass/checkParamALessOrEqualThanB a b) a b))

