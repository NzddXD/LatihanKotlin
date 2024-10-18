package app.src.entity
import app.src.entity.*

// Attr here -----------------------------------------

// ---------------------------------------------------

class Ikan(name:String):Burung(name) {
    // Mengganti
    override val nama : String

    init {
        nama = "Lele"
    }

    override fun info(){
        println("Aku ikan " + (this.nama))
    }
}