package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Memperluas Fungsi pada Class" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val user = User("Nezad")
    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    println(user.greet())

}

fun User.greet():String {
    return "Hello! " + this.nama
}