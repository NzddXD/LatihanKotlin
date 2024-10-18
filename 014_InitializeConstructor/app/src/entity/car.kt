package app.src.entity

// Attr here -----------------------------------------

// ---------------------------------------------------

class Kucing constructor(val _nama : String, val _usia : Int, val _ras : String) {

    // Member Vars
    var nama : String; var usia : Int; var ras : String

    // Initializer Block : Panggil otomatis ketika objek dari Class berhasil dibuat 
    init {
        this.nama = _nama
        this.usia = _usia
        this.ras = _ras

        println("Nama: $nama")
        println("Usia: $usia")
        println("Ras: $ras")
        println("")
    }

    // Method
    fun suara(suara : String) = println(suara)
}