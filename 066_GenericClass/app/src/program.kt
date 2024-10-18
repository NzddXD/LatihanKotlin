package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Class Generik" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val kotakStr = Kotak<String>("Konten String")
    val kotakInt = Kotak<Int>(190)

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    kotakStr.tampilkanIsi()
    line.line(18)
    kotakInt.tampilkanIsi()
    line.line(18)
}