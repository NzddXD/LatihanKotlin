package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Nilai Dasar Constructor" // <- Ganti yg isi ininya ja
    title.header()
    // ---------------------------------------------------------------


    // Common Vars here ----------------------------------------------


    // Object Istance here -------------------------------------------
    val hum1 = Manusia("Nezad", 15)
    val hum2 = Manusia("Not Nezad", 15)
    /* leave blank to set to default value */

    // Change Attr here ----------------------------------------------


    // Call Method here ----------------------------------------------

}