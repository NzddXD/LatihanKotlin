package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Multi Implementation" // <- Ganti yg isi ininya ja
    title.header()
    // ---------------------------------------------------------------


    // Common Vars here ----------------------------------------------


    // Object Istance here -------------------------------------------
    val human = Manusia()
    human.infoMakan()


    // Change Attr here ----------------------------------------------


    // Call Method here ----------------------------------------------
}