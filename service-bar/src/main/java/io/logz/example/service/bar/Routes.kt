package io.logz.example.service.bar

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.route
import io.ktor.routing.routing

fun Route.bar() {
    route("bar") {
        get {
            call.respondText("Hello from Bar!")
        }
    }
}

fun Application.registerBar() {
    routing {
        bar()
    }
}
