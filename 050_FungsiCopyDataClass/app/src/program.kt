package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Fungsi Copy Pada Class Data" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val orang1 = Orang("Ellis", 20)
    val orang2 = orang1.copy(nama = "Nick")

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    println(orang1)
    println(orang2)
}