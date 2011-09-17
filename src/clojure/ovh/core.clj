(ns ovh.core
  (:use [clojure.string :only (blank?)]))

(def ^{:dynamic true} *service*)
(def ^{:dynamic true} *session*)

(defn service
  "Returns an OVH manager service."
  [] (.getmanagerPort (com.ovh.ManagerServiceLocator.)))

(defn domain-list
  "Returns the list of domain names."
  [] (seq (.domainList *service* *session*)))

(defn domain-info
  "Returns information for the given domain."
  [domain] (bean (.domainInfo *service* *session* domain)))

(defn zone-entry-list
  "Returns the zone entries for a domain."
  [domain] (map bean (seq (.zoneEntryList *service* *session* domain))))

(defn find-zone-entry
  "Find a zone entry by domain, subdomain and fieldtype. "
  [domain subdomain fieldtype]
  (->> (zone-entry-list domain)
       (filter #(and (= subdomain (:subdomain %1)) (= fieldtype (:fieldtype %1))))
       (first)))

(defn add-zone-entry
  "Add a zone entry for a domain."
  [domain subdomain fieldtype target & [overwrite]]
  (.zoneEntryAdd *service* *session* domain subdomain fieldtype target (or overwrite false))
  (find-zone-entry domain subdomain fieldtype))

(defn delete-zone-entry
  "Delete a zone entry for a domain."
  [domain subdomain fieldtype]
  (if-let [entry (find-zone-entry domain subdomain fieldtype)]
    (.zoneEntryDel *service* *session* domain subdomain fieldtype (:target entry))))

(defn update-zone-entry
  "Update a zone entry for a domain."
  [domain subdomain fieldtype target]
  (if-let [entry (find-zone-entry domain subdomain fieldtype)]
    (.zoneEntryModify *service* *session* domain subdomain fieldtype (:target entry) target)
    (add-zone-entry domain subdomain fieldtype target))
  (find-zone-entry domain subdomain fieldtype))

(defn print-zone-entries
  "Print the zone entries of domain."
  [domain]
  (println "SUBDOMAIN                      FIELDTYPE  TARGET")
  (println "-----------------------------------------------------------------------------------------------------")
  (doseq [entry (sort-by :subdomain (zone-entry-list domain))]
    (println (format "%-30s %-10s %-30s" (:subdomain entry) (:fieldtype entry) (:target entry)))))

(defn print-zone-entries
  "Print the zone entries of domain."
  [domain]
  (let [template "%-15s %-10s %-30s"]
    (println (format template "SUBDOMAIN" "FIELDTYPE" "TARGET"))
    (println (apply str (repeat 80 "-")))
    (doseq [entry (sort-by :subdomain (zone-entry-list domain))]
      (println (format template (:subdomain entry) (:fieldtype entry) (:target entry))))))

(defn login
  "Login with NIC handle and password and return a session."
  [nic-handle password & [language multi-session]]
  (.login *service* nic-handle password (or language "en") (or multi-session false)))

(defmacro with-service
  "Evaluate body with *service* bound to a new manager service."
  [& body] `(binding [*service* (service)] ~@body))

(defmacro with-session [[nic-handle password & [language multi-session]] & body]
  `(with-service
     (binding [*session* (login ~nic-handle ~password ~language ~multi-session)]
       ~@body)))
