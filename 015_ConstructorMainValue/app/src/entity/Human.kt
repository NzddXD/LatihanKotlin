package app.src.entity

// Attr here -----------------------------------------

// ---------------------------------------------------

class Manusia(val _nama : String, val _usia : Int = 20){
    // Member Vars
    var nama : String
    var usia : Int

    init {
        this.nama = _nama
        this.usia = _usia
        println("Nama: $nama")
        println("Usia: $usia")
    }
}