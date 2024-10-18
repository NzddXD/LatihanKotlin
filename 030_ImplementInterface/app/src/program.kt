package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Implementasi Interface" // <- Ganti yg isi ininya ja
    title.header()
    // ---------------------------------------------------------------


    // Common Vars here ----------------------------------------------


    // Object Istance here -------------------------------------------
    val line = Line.drawLine()

    val human = Manusia()
    val elgato = Kucing()

    // Change Attr here ----------------------------------------------


    // Call Method here ----------------------------------------------
    human.info()
    line.line(45)
    println("")
    elgato.info()
}