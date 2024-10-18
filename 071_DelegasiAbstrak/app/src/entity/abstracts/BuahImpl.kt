package app.src.entitas.abstractcollect

import app.src.entitas.interfacecollect.Buah

class BuahImpl : Buah {
    override fun potong(): String {
        return "Buah dipotong"
    }
}
