(ns plus.plus-test
  (:require [clojure.test :refer :all]
            [plus.plus :refer :all]))

(deftest plus-test
  (testing "Plus"
    (is (= 3 (plus 1 2)))))
