package io.logz.example.infra.rest

import io.ktor.application.Application
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

class KtorRestServer(
    private val serviceName : String,
    port: Int = 8080,
    routes: List<Application.() -> Unit> = listOf()
) {
    private val embeddedServer = embeddedServer(Netty, port = port) {
        registerDefaultRoutes(serviceName)
        routes.forEach { it.invoke(this) }
    }

    fun start() {
        embeddedServer.start(wait = true)
    }

    fun stop() {
        embeddedServer.stop(5000, 5000)
    }
}
