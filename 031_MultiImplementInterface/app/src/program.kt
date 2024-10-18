package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Multi-Implement Interface" // <- Ganti yg isi ininya ja
    title.header()
    // ---------------------------------------------------------------


    // Common Vars here ----------------------------------------------


    // Object Istance here -------------------------------------------
    val line = Line.drawLine()
    val interfaces = Interfaces()

    // Change Attr here ----------------------------------------------


    // Call Method here ----------------------------------------------
    interfaces.infoA()
    interfaces.infoB()
    interfaces.infoC()
    interfaces.infoD()
    line.line(45)
    println("")
}