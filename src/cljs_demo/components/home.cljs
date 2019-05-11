(ns cljs-demo.components.home
  (:require [lembas.core :refer [m]]
            [cljs-demo.components.main :refer [main-component]]))

(defn click-handler [event]
  (js/alert "CLICKED!!!!"))

(defn home-view [vnode]
  (m :div {:class "container"}
     (m :h1 {:class "center"} "DEMO!")
     (m :h4 {:class "center"} "This is a demo!")
     (m :div {:class "center"}
        (m :button {:class "btn btn-large waves-effect waves-light center"
                    :type "button"
                    :onclick click-handler} "Click Me"))))

(defn home-component []
  (main-component {:view home-view}))
