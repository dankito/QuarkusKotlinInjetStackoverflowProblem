package com.acme

import io.quarkus.vertx.web.Route
import io.vertx.core.Vertx
import io.vertx.core.http.HttpMethod
import io.vertx.ext.web.RoutingContext
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject

@ApplicationScoped
open class Routing {

    @Inject
    lateinit var vertx: Vertx

    @Route(path = "/hello", methods = [HttpMethod.GET])
    fun handle(rc: RoutingContext) {
        println(vertx)
        rc.response().end("hello")
    }
}