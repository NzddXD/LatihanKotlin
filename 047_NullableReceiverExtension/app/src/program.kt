package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Extensi Nullable Receiver" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------
    val n1 : String? = "nezad"
    val n2 : String? = null

    // Object Istance here -------------------------------------------


    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    println(n1.capitalize())
    println(n2.capitalize())
}

fun String?.capitalize():String? {
    return this?.uppercase()
}