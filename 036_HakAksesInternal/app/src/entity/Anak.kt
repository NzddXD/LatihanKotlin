package app.src.entity
import app.src.entity.*

class Anak:Ayah() {
    var nama = "Nezad"

    fun intro(){
        println("Hai, aku $nama")
        println("Aku tinggal dengan Ayah")
        println("Ayah saya bernama $nama_ayah")
        println("Ayahku suka makan ${makanan()}")
    }
}