package app.src.entity

import kotlin.properties.Delegates

class Pengguna {
    var nama : String by Delegates.observable("Nezad") {
        _, old, new -> println("Updated $old to $new")
    }
}