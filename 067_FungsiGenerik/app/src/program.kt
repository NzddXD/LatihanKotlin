package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Fungsi Generik" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    cetak("Hello, ummm...")
    line.line(20)
    cetak(827)
    line.line(20)
    cetak(29.4)
    line.line(20)
}

fun <T> cetak(nilai : T){
    println("Nilai: $nilai")
}