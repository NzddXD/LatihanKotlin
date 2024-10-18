package app.src.entity
import app.src.entity.*

// Attr here -----------------------------------------

// ---------------------------------------------------

class Manusia:MakhlukHidup {
    // Implement attr dari interface MakhlukHidup
    override var nama_makhluk : String = "Todd"
    override var habitat : String = "Military Base"

    // Implement attr dari interface MakhlukHidup
    override fun jenis_makanan():String = "Omnivora"
    override fun info(){
        println("Nama: $nama_makhluk")
        println("Habitat: $habitat")
        println("Jenis Makanan: ${jenis_makanan()}")
    }
}