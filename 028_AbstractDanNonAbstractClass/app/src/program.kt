package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Class Abstrak dan Non Abstrak" // <- Ganti yg isi ininya ja
    title.header()
    // ---------------------------------------------------------------


    // Common Vars here ----------------------------------------------


    // Object Istance here -------------------------------------------
    val line = drawLine()
    val people = Karyawan("Zoey")
    var usia : Int

    // Change Attr here ----------------------------------------------
    people.setUsiaOrang(20)

    // Call Method here ----------------------------------------------
    usia = people.getUsiaOrang()
    people.getNamaOrang()

    println("Usia: $usia" )
    line.line(45)
    println("")
    
}