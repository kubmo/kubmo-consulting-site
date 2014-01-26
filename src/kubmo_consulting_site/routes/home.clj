(ns kubmo-consulting-site.routes.home
  (:use compojure.core)
  (:require [kubmo-consulting-site.views.layout :as layout]
            [kubmo-consulting-site.util :as util]))

(defn home-page []
  (layout/render
    "home.html" {:content (util/md->html "/md/docs.md")
                 :hello "kinsey"}))

(defn about-page []
  (layout/render "about.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page)))



