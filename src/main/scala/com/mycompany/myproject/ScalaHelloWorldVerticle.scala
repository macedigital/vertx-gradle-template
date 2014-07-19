package com.mycompany.myproject

import org.vertx.scala.core.http.HttpServerRequest
import org.vertx.scala.platform.Verticle

class ScalaHelloWorldVerticle extends Verticle {

  override def start() {
    vertx.createHttpServer.requestHandler { req: HttpServerRequest =>
      req.response.sendFile("./www/index.html")
    }.listen(8080)
  }

}
