package io.logz.example.service.foo

import io.ktor.application.Application
import io.logz.example.infra.rest.KtorRestServer
import kotlin.concurrent.thread

class ServiceFooApp {
    private val server = KtorRestServer(serviceName = "Foo", port = 9000, routes = listOf(Application::registerFoo))

    fun start() {
        registerShutdownHook()
        server.start()
    }

    private fun registerShutdownHook() {
        Runtime.getRuntime().addShutdownHook(thread(start = false) { server.stop() })
    }
}
