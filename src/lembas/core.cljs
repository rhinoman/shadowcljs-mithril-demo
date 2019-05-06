(ns lembas.core
  (:require mithril))

(defn m
  ([selector]
   (mithril/m (clj->js selector)))
  ([selector attr]
   (mithril/m (clj->js selector) (clj->js attr)))
  ([selector attr & children]
   (mithril/m (clj->js selector) (clj->js attr) (clj->js children))))

(defn component [^IPersistentMap c]
  (clj->js c))

(defn mount
  [element component]
  (mithril/mount element component))

(defn route
  [root default-route routes]
  (mithril/route root default-route (clj->js routes)))

(defn redraw []
  (mithril/redraw))

(defn trust [html]
  (mithril/trust html))
