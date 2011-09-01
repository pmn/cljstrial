(ns cljstrial.views.common
  (:use noir.core
        hiccup.core
        hiccup.page-helpers))

(defpartial layout [& content]
            (html5
              [:head
               [:title "cljstrial"]
               (include-css "/css/reset.css")]
              [:body
               [:div#wrapper
                content]
               (include-js "/cljs/bootstrap.js")]))
