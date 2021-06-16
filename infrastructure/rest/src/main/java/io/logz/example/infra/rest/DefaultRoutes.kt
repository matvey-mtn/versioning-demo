package io.logz.example.infra.rest

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.route
import io.ktor.routing.routing

fun Route.defaultRoutes(serviceName: String) {
    route("/health") {
        get {
            call.respondText("Status: $serviceName is Up!")
        }
    }
}

fun Application.registerDefaultRoutes(serviceName: String) {
    routing {
        defaultRoutes(serviceName)
    }
}
