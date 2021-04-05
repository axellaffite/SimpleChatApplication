package com.simplechat

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.simplechat.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureHTTP()
        configureTemplating()
        configureSerialization()
        configureSockets()
    }.start(wait = true)
}
