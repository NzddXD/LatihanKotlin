package app.src.entity
import app.src.entity.*

// Attr here -----------------------------------------

// ---------------------------------------------------
class Anak(override var nama : String = "Apalah"):Ayah(){
    override fun perkenalan(){
        println("Hai aku anak anak")

        // Akses member (Attribut dan Method) dari super class
        println("Saya anak dari ayah " + super.nama)
        super.makanan()
    }

    override fun makanan(){
        println(this.nama + " suka makan anak")
    }
}