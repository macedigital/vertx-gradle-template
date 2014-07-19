var vertx = require('vertx');

vertx.createHttpServer().requestHandler(function(req) {
  var file = 'index.html';
  req.response.sendFile('./www/' + file);
}).listen(8080)