package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Enum Dengan Constructor" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val rupiah = Uang.IDR
    val eur = Uang.EUR

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    println("Nilai tukar 1 ${rupiah.nama} terhadap ${Uang.USD.nama}: ${rupiah.nilai}")
    line.line(34)
    println("Nilai tukar 1 ${eur.nama} terhadap ${Uang.USD.nama}: ${eur.nilai}")
    line.line(34)

}