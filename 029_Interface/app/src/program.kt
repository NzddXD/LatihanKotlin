package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Interface" // <- Ganti yg isi ininya ja
    title.header()
    // ---------------------------------------------------------------


    // Common Vars here ----------------------------------------------


    // Object Istance here -------------------------------------------
    val line = Line.drawLine()

    val kucing = Kucing()
    kucing.makan()

    val jerapah = Jerapah()
    jerapah.makan()
    jerapah.nama = "Idk"

    // Change Attr here ----------------------------------------------
    people.setUsiaOrang(20)

    // Call Method here ----------------------------------------------
    println(kucing.infoHewan())
    kucing.nama = "Mochi"
    println("Kucing baru: ${kucing.infoHewan()}")

    line.line(45)
    println("")

    println(jerapah.infoHewan())
    jerapah.nama = "Gatau"
    println("Jerapah baru: ${jerapah.infoHewan()}")
    line.line(45)
    println("")
}