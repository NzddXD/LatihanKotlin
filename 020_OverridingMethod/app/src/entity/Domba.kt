package app.src.entity

// Attr here -----------------------------------------

// ---------------------------------------------------
open class Domba(val name:String) {
    // Akan terjadi error jika class Domba tidak mempunyai constructor
    fun bernafas(){
        println("Binatang bernafas")
    }

    open fun makan(){
        print(name + " sedang makan")
    }
}