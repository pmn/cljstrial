(ns cljstrial.server
  (:require [noir.server :as server]
            [noir.pinot.remotes :as remotes]))

(server/load-views "src/cljstrial/views/")

(server/add-middleware remotes/wrap-remotes)


(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'cljstrial})))

