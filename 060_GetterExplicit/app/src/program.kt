package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Getter Explicit" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val kotak = Kotak(12, 19)

    // Change Attr here ----------------------------------------------
    val panjang = kotak.getPanjang
    val lebar = kotak.getLebar

    // Call Method here ----------------------------------------------
    println("Panjang: $panjang")
    line.line(18)
    println("Lebar: $lebar")
    line.line(18)
}