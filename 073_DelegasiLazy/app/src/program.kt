package app.src

import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

val myVar : String by lazy {
    "Hi"
}

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Delegasi Lazy" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------

    // Change Attr here ----------------------------------------------
   
    // Call Method here ----------------------------------------------
    println(myVar + " there.")
}