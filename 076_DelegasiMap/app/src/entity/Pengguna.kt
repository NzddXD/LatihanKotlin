package app.src.entity

import kotlin.properties.Delegates

class Pengguna {
    private val dataPengguna = mutableMapOf<String, Any?>()

    // delegate property string dari map
    var nama by dataPengguna

    // delegate property int dari map
    var umur by dataPengguna

    // delegate property bool dari map
    var aktif by dataPengguna
}