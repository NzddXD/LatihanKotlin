package app.src.entity

// Attr here -----------------------------------------

// ---------------------------------------------------
open class Burung(val name:String) {
    // Akan terjadi error jika class Domba tidak mempunyai constructor
    open val nama : String = name

    open fun info(){
        print("Hello! Saya adalah seekor burung" + this.nama)
    }
}