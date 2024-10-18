package app.src.entity

// Attr here -----------------------------------------

// ---------------------------------------------------
open class Domba(val name:String) {
    // Akan terjadi error jika class Domba tidak mempunyai constructor
    final fun bernafas(){
        println("Binatang bernafas")
        /* Dengan keyword final, artinya method ersebut ketika
        diturunkan ke kelas anak tidak dapat diganti/diubah 
        menggunakan metode override */
    }

    open fun makan(){
        print("Domba sedang makan rumputs")
    }
}