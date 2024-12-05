package app.src.entity

import kotlin.properties.Delegates

class Pengguna {
    var umur : Int by Delegates.vetoable(18) {
        _, _, new -> if (new < 18){
            println("Lol get out kiddo :P")
            false
        } else {
            true
        }
    }
}