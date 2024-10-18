package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Penggunaan Field dalam Setter dan Getter" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val kotak = Kotak(12, 19)

    // Change Attr here ----------------------------------------------
    kotak.setPanjang = 10
    kotak.setLebar = -4
    
    val panjang = kotak.setPanjang
    val lebar = kotak.setLebar

    // Call Method here ----------------------------------------------
    println("Panjang: $panjang")
    line.line(18)
    println("Lebar: $lebar")
    line.line(18)
}