(ns cljs-demo.core
  (:require [lembas.core :refer [m mount component]]
            materialize-css
            [cljs-demo.components.home :refer [home-component]]))

(defn handler [event]
  (js/alert "HOWDY!"))

(defn start []
  (mount (js/document.getElementById "app") (home-component)))

(defn ^:export init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (start))

(defn stop []
  ;; stop is called before any code is reloaded
  ;; this is controlled by :before-load in the config
  (js/console.log "stop"))
