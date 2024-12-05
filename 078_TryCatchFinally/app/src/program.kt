package app.src

import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Try Catch Finally" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------

    // Change Attr here ----------------------------------------------
    try {
        val result = 10 / 0
        println("No errors encountered. Result: $result")
    }
    catch (e:ArithmeticException) {
        println("An error occured. Arithmetic problem: ${e.message}")
    }
    finally {
        println("Sucessfully executed. ")
    }
    // Call Method here ----------------------------------------------
}