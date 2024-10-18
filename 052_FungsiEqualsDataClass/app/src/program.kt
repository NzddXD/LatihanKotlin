package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Fungsi Equals Pada Class Data" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val orang1 = Orang("Nick", 24)
    val orang2 = orang1.copy(nama = "Rochelle", usia = 20)

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    // Compare
    println(orang1.equals(orang2))
}