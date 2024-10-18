package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Private Encapsulation" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val kotak = Kotak()

    // Change Attr here ----------------------------------------------
    kotak.setPanjang(5)
    kotak.setLebar(3)
    
    val panjang = kotak.setPanjang(10)
    val lebar = kotak.setLebar(8)

    // Call Method here ----------------------------------------------
    println("Panjang: ${kotak.getPanjang()}")
    line.line(18)
    println("Lebar: ${kotak.getLebar()}")
    line.line(18)
    println("Luas: ${kotak.hitungLuas()}")
    line.line(18)
}