package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Enkapsulasi Metode Setter dan Getter" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val kotak = Kotak()

    // Change Attr here ----------------------------------------------
    kotak.panjangKustom = 5
    kotak.lebarKustom = 3
    

    // Call Method here ----------------------------------------------
    println("Panjang: ${kotak.panjang}")
    line.line(18)
    println("Lebar: ${kotak.lebar}")
    line.line(18)
    println("Luas: ${kotak.hitungLuas()}")
    line.line(18)
}