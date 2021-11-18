package online.scattergories

import io.ktor.server.engine.*
import io.ktor.server.cio.*
import online.scattergories.plugins.*

fun main() {
    embeddedServer(CIO, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureMonitoring()
        configureSerialization()
    }.start(wait = true)
}
