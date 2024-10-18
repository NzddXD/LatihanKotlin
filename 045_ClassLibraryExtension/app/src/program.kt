package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Memperluas Fungsi pada Class Library" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------
    val text = "bandung, jawa barat"
    val capitalize = text.capitalizeWords()

    // Object Istance here -------------------------------------------


    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    println("Capitalized: $capitalize")

}

fun String.capitalizeWords():String {
    return this.split("").joinToString(""){it.capitalize()}
}