package app.src.entity

// Attr here -----------------------------------------

// ---------------------------------------------------

class Siswa{
    // Member Vars
    var nama : String
    var usia : Int

    init {
        println("Hi!")
    }

    /* Secondary Constructor: Tidak mengizinkan val atau var */
    constructor (_name : String, _age : Int){
        this.nama = _name
        this.usia = _age
        println("Nama: $nama")
        println("Usia: $usia")
    }

}