package app.src.entity
import app.src.entity.*

// Attr here -----------------------------------------

// ---------------------------------------------------

class Kucing:MakhlukHidup {
    // Implement attr dari interface MakhlukHidup
    override var nama_makhluk : String = "Big Guy"
    override var habitat : String = "My House"

    // Implement attr dari interface MakhlukHidup
    override fun jenis_makanan():String = "Karnivora"
    override fun info(){
        println("Nama: $nama_makhluk")
        println("Habitat: $habitat")
        println("Jenis Makanan: ${jenis_makanan()}")
    }
}