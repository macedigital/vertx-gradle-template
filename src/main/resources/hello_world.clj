(ns example.server
  (:require [vertx.http :as http]))

(-> (http/server)
  (http/on-request
    (fn [req]
      (let [uri (.uri req)]
        (-> req
          (http/server-response)
          (http/send-file (str "./www/index.html" uri))))))
  (http/listen 8080))
