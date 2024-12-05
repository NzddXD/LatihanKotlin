package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Interface Generik" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val daftarBarang = DaftarBarang()

    // Change Attr here ----------------------------------------------
    daftarBarang.tambah("Buku")
    daftarBarang.tambah("Penghapus")
    daftarBarang.tambah("Pensil")
    daftarBarang.tambah("Super Mega Ultimate Huggable Garfield Plush")

    // Call Method here ----------------------------------------------
    daftarBarang.daftarKoleksi()
    line.line(20)
}