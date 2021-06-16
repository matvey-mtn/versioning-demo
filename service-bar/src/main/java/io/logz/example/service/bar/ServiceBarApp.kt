package io.logz.example.service.bar

import io.ktor.application.Application
import io.logz.example.infra.rest.KtorRestServer
import kotlin.concurrent.thread

class ServiceBarApp {
    private val server = KtorRestServer(serviceName = "Bar", port = 9010, routes = listOf(Application::registerBar))

    fun start() {
        registerShutdownHook()
        server.start()
    }

    private fun registerShutdownHook() {
        Runtime.getRuntime().addShutdownHook(thread(start = false) { server.stop() })
    }
}
