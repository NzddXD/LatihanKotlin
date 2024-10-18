package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Final Overriding Method" // <- Ganti yg isi ininya ja
    title.header()
    // ---------------------------------------------------------------


    // Common Vars here ----------------------------------------------


    // Object Istance here -------------------------------------------
    val car = Kucing("Mittens")

    // Change Attr here ----------------------------------------------


    // Call Method here ----------------------------------------------
    car.makan()
    car.bernafas()
    car.act("playing a ball of yarn")
}