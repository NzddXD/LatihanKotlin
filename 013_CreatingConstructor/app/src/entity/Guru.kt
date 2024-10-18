package app.src.entity

// Attr here -----------------------------------------

class Guru constructor(val nama : String, val mapel : String, val email : String) {
// Method here ---------------------------------------
    fun infoGuru(){
        println("------------ Info Guru ------------")
        println("Nama: " + nama)
        println("Mapel: " + mapel)
        println("E-mail: " + email)
        println("-----------------------------------")
    }
}