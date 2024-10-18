package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Menggunakan Keyword 'is'" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------
    val myWord : Any = "Hello!"
    val another : Any = 2.9 + 7.3

    // Object Istance here -------------------------------------------
    val check = Inspect()

    // Change Attr here ----------------------------------------------
    
    // Call Method here ----------------------------------------------
    println(check.inspect(myWord))
    println(check.inspect(another))
}