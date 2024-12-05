package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Delegasi Map" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val pengguna = Pengguna()

    // Change Attr here ----------------------------------------------
    pengguna.nama = "Helen Park"
    pengguna.umur = 24
    pengguna.aktif = true
    
    // Call Method here ----------------------------------------------
    println("Nama: ${pengguna.nama}\nUmur: ${pengguna.umur}\nAktif: ${pengguna.aktif}")
    line.line(30)
}