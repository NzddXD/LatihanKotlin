package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Polymorphism dengan Overloading" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    var orang = Mahasiswa()

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    orang.kenalan("Muhammad Nezad", "Laki - Laki") // 1
    line.line(45)
    orang.kenalan("Muhammad Nezad", "Laki - Laki", "Bandung") // 2
    line.line(45)
    orang.kenalan("Muhammad Nezad", "Tidak melakukan apapun", 1517296L) // 3
    line.line(45)
}