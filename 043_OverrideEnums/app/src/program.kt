package app.src

import app.src.entity.Buah
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Override Enum" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val aples = Buah.APPLE
    val banana = Buah.BANANA
    val orang = Buah.ORANG

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    println("${aples.nama}: ${aples.desc()}")
    line.line(34)
    println("${banana.nama}: ${banana.desc()}")
    line.line(34)
    println("${orang.nama}: ${orang.desc()}")

}