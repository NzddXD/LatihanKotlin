package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Fungsi hashCode() Pada Data Class" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val orang1 = Orang("Nick", 24)
    val orang2 = Orang("Nick", 24)

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    // Compare
    println(orang1 == orang2)
    println(orang1.hashCode() == orang2.hashCode())
}