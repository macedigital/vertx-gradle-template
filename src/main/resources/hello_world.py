import vertx

server = vertx.create_http_server()

@server.request_handler
def request_handler(req):
    file = "index.html"
    req.response.send_file("www/%s" % file)
server.listen(8080)
