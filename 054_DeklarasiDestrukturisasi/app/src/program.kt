package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Deklarasi Destrukturisasi" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val (nama, usia) = Orang("Louis", 23)

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    println("Nama: $nama\nUsia: $usia")
}