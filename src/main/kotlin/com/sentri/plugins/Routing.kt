package com.sentri.plugins

import com.sentri.sendNotification
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        sendNotification()
//        get("/") {
//            call.respondText("Hello World!")
//        }
    }
}
