package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Abstract Class" // <- Ganti yg isi ininya ja
    title.header()
    // ---------------------------------------------------------------


    // Common Vars here ----------------------------------------------


    // Object Istance here -------------------------------------------
    val line = drawLine()
    val ppl = Karyawan("Zoey")
    var usia : Int

    // Change Attr here ----------------------------------------------
    usia = setUsiaOrang(20)
    ppl.getNamaOrang()

    // Call Method here ----------------------------------------------
    println("Usia: $usia")
    line.line(45)
    println("")
    
}