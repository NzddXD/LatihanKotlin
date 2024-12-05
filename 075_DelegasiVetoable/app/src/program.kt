package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Delegasi Vetoable" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val pengguna = Pengguna()

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    println(pengguna.umur)
    line.line(30)
    pengguna.umur = 5
    println(pengguna.umur)
    line.line(30)
    pengguna.umur = 19
    println(pengguna.umur)
}