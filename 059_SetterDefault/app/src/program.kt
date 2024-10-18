package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Setter Default" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val lingkaran = Circle()
    lingkaran.radius = 9.3 // Will use getter for getting property value

    // Change Attr here ----------------------------------------------
    
    // Call Method here ----------------------------------------------
    println("Radius: ${lingkaran.radius}")
    line.line(30)
}