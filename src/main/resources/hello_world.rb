require "vertx"

Vertx::HttpServer.new.request_handler do |req|
    file = "index.html"
    req.response.send_file "www/#{file}"
end.listen(8080)