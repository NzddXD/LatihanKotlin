package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Properties Extension" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val persegiPanjang = Rectangle(5.0, 3.0)

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    println("Luas persegi panjang = ${persegiPanjang.Luas}")
    println("Keliling persegi panjang = ${persegiPanjang.Keliling}")
}

val Rectangle.Luas : Double {
    get() = lebar * tinggi
}
val Rectangle.Keliling : Double {
    get() = 2 * (lebar + tinggi)
}