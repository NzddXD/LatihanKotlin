package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Delegasi Observable" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val pengguna = Pengguna()
    val quotes = Quotes()

    // Change Attr here ----------------------------------------------
    pengguna.nama = ("Nezad")

    // Call Method here ----------------------------------------------
    println(pengguna.nama)
    line.line(24)
    quotes.ket = "Wow what a beautiful d-"
    quotes.ket = "Nvm i hate school so much"
}