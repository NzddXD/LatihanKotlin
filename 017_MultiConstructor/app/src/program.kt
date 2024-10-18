package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "MUlti Secondary Constructor" // <- Ganti yg isi ininya ja
    title.header()
    // ---------------------------------------------------------------


    // Common Vars here ----------------------------------------------


    // Object Istance here -------------------------------------------
    val name = Orang("Nezad", 15, "Pelajar")
    val no_one = Orang("No One", 777, "Null", 99999999)

    /* leave blank to set to default value */

    // Change Attr here ----------------------------------------------


    // Call Method here ----------------------------------------------

}