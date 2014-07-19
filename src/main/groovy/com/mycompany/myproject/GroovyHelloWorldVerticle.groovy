package com.mycompany.myproject

import org.vertx.groovy.platform.Verticle

class GroovyHelloWorldVerticle  extends Verticle {

    def start() {
        vertx.createHttpServer().requestHandler { req ->
            req.response.sendFile "./www/index.html"
        }.listen(8080)
    }
}
