package net.bytebros.template

import dev.fritz2.dom.html.render


fun main() {
    render("target") {
        h1 { +"Ktor Fritz2 Template" }
    }
}