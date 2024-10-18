package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Enum Tanpa Constructor" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val warnaFav = Warna.GREEN

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    println("Warna favoritkuu: $warnaFav")
    line.line(34)

}