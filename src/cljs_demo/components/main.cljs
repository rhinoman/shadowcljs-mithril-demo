(ns cljs-demo.components.main
  (:require [lembas.core :refer [m component]]
            [cljs-demo.components.header :refer [header-component]]))

(defn main-view [content]
  (fn [vnode]
    (m :div
       (m header-component)
       (m content))))

(defn main-component [content]
  "Creates a root level component with a header and footer"
  (component {:view (main-view content)}))


