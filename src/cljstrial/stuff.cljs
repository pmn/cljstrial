(ns cljs.js
  (:require [pinot.html :as ph]
            [pinot.remotes :as remote]
            [pinot.events :as pe])
  (:require-macros [pinot.macros :as pm]))

(pe/on (ph/dom-find "#boxen") :click
       (fn [me e]
         (pm/remote (printer "sup") [result]
                    (js/alert result))))
