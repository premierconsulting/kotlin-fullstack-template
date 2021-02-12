package net.bytebros.template

import dev.fritz2.dom.html.render
import dev.fritz2.dom.mount

fun main() {
    render {
        h1 { +"Ktor Fritz2 Template" }
    }.mount("target")
}