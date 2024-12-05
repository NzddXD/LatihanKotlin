package app.src

import app.src.entity.BuahBlender
import app.src.entity.abstractcollect.BuahImpl
import app.src.entity.*

import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Delegasi Abstrak" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------
    val buah = BuahImpl()
    val buahBlender = BuahBlender(buah)

    // Object Istance here -------------------------------------------

    // Change Attr here ----------------------------------------------
   
    // Call Method here ----------------------------------------------
    buahBlender.blend()
    buahBlender.potong()
}