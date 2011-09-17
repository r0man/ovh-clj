(defproject ovh "0.0.1-SNAPSHOT"
  :description "Clojure Library for the OVH Web Services."
  :dependencies [[axis/axis "1.4"]
                 [org.clojure/clojure "1.2.1"]]
  :dev-dependencies [[lein-axis "0.1.1"]]
  :axis [["http://www.ovh.com/soapi/soapi-re-1.24.wsdl" "com.ovh"]]
  :source-path "src/clojure"
  :java-source-path "src/java")

