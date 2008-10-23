(defn blank? [x]
  (or (nil? x) (= x "")))

(deftest test-blank
  (is (= false (blank? 42)))
  (is (= true (blank? nil)))
  (is (= true (blank? "")))
  (is (= false (blank? "hello"))))

(defn present? [x] 
  (not (blank? x)))

(defn- length-checker [len #^java.lang.String str]
  "asserts that str's length is <= len"
  (<= (.length str) len))

(defn max-length [y]
  "returns a function that asserts that a string's length is less than or equal to y"
  (partial length-checker y))