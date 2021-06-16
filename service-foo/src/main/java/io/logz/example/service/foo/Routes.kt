package io.logz.example.service.foo

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.route
import io.ktor.routing.routing
import io.logz.example.infra.string.utils.Strings

fun Route.foo() {
    route("foo") {
        get {
            call.respondText("Hello from Foo!")
        }
    }
}

fun Application.registerFoo() {
    routing {
        foo()
    }
}

fun Route.bar() {
    route("bar") {
        get {
            Strings.concat("foo ", "  bar  ")
        }
    }
}
