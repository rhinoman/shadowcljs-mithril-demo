(ns cljs-demo.components.header
  (:require [lembas.core :refer [m component]]))


(defn navbar-view [vnode]
  (m :nav {:id "mainNav"}
     (m :div {:class "nav-wrapper"}
        (m :a {:href "#" :class "brand-logo"} "Demo!")
        (m :ul {:id "navMobile" :class "right hide-on-med-and-down"}
                (m :li (m :a {:href "#"} "Menu Item"))))))


(def header-component {:view navbar-view})