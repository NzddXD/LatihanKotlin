package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Getter Default" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val user = Pengguna()
    val username = user.nama // Will use getter for getting property value

    // Change Attr here ----------------------------------------------
    
    // Call Method here ----------------------------------------------
    println("Username: $username")
    line.line(username.length)
}