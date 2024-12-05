package app.src.entity.abstractcollect

import app.src.entity.interfacecollect.Buah

class BuahImpl : Buah {
    override fun potong(){
        println("Buah dipotong")
    }
}
