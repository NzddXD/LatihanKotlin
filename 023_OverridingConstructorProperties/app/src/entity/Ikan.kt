package app.src.entity
import app.src.entity.*

// Attr here -----------------------------------------

// ---------------------------------------------------

class Ikan(override val nama:String = "Lel"):Burung(nama) {
    // Mengganti
    override fun info(){
        println("Aku ikan $nama")
    }
}