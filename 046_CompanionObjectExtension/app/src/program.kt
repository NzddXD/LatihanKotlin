package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Memperluas Objek Pengiring Class" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    for (i in 0..10){
        User.tambah()
    }

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    println("Jumlah user: ${User.jumlah}")

}

fun User.Companion.tambah() {
    jumlah++
}