package app.src.entity

// Attr here -----------------------------------------

class Siswa constructor(val nama : String, val mapel : String, val email : String) {
// Method here ---------------------------------------
    fun infoSiswa(){
        println("------------ Info Siswa ------------")
        println("Nama: " + nama)
        println("Mapel: " + mapel)
        println("E-mail: " + email)
        println("------------------------------------")
    }
}