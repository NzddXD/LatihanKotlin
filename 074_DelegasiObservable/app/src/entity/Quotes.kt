package app.src.entity

import kotlin.properties.Delegates

class Quotes {
    var ket : String by Delegates.observable("I hate my life") {
        _, old, new -> println("$old updated to $new")
    }
}