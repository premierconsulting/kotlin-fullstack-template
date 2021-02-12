package net.bytebros.template

import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.routing.*

fun Application.module() {
    routing {
        static {
            resources("app")
            defaultResource("app/index.html")
        }
    }
}

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)