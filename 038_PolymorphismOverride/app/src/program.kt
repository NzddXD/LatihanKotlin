package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Polymorphism dengan Overriding" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    var big_guy = Kucing()
    var ayam = Ayam()

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    big_guy.makan()
    line.line(20)
    ayam.makan()
}