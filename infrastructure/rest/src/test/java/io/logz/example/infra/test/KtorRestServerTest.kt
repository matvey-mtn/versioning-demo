package io.logz.example.infra.test

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.route
import io.ktor.routing.routing
import io.logz.example.infra.rest.KtorRestServer

fun main(args: Array<String>) {
    KtorRestServer(serviceName = "TestService", routes = listOf(Application::registerCustomRoute)).start()
}

fun Route.customRoute() {
    route("/hello") {
        get {
            call.respondText("Hello!")
        }
    }
}

fun Application.registerCustomRoute() {
    routing {
        customRoute()
    }
}
