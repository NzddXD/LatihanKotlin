package app.src

import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Throw" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------

    // Change Attr here ----------------------------------------------
    try {
        val result = divide(10, 0)
        println("Result: $result")
    }
    catch (e:ArithmeticException) {
        println("An error occured: ${e.message}")
    }
    // Call Method here ----------------------------------------------
}

fun divide(a:Int, b:Int):Int {
    if (b == 0){
        throw ArithmeticException("Cannot divide by zero u dumbass >:(")
    }
    return a / b
}