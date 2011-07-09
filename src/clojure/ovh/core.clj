(ns ovh.core
  (:use [clojure.contrib.def :only (defvar)]))

(defvar *service* nil
  "The current OVH manager service.")

(defvar *session* nil
  "The current OVH manager session.")

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
  "Returns the zone entries for the domain."
  [domain] (map bean (seq (.zoneEntryList *service* *session* domain))))

(defn add-zone-entry
  "Add a zone entry for the domain."
  [domain sub-domain type target & [overwrite]]
  (.zoneEntryAdd *service* *session* domain sub-domain type target (or overwrite false)))

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
