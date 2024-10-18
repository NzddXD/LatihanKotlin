package app.src.entity

// Attr here -----------------------------------------

// ---------------------------------------------------
abstract class Orang(_nama : String) {
    var nama : String       // Non Abstrak
    abstract var usia : Int // Abstrak

    init {
        this.nama = _nama
    }
    // Abstract
    abstract fun setUsiaOrang(_usia : Int)
    abstract fun getUsiaOrang():Int

    // Non Abstrak
    fun getNamaOrang(){
        println("Nama: $nama")
    }
}