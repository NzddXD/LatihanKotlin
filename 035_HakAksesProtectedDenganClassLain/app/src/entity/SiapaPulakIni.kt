package app.src.entity
import app.src.entity.*

class OrangLain{
    fun stealData(){
        // Buat objek dari kelas Ayah
        var ayah1 = Ayah()

        // Panggil attr dari kelas ayah [ERROR: Atribut bersifat protected]
        println("Nama: " + ayah1.nama_ayah)
    }
}