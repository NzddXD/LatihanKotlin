package app.src

// import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main() {
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Kesalahan Bersarang" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------
    
    // Object Istance here -------------------------------------------

    // Change Attr here ----------------------------------------------
    try {
        val result = calc(10, 0)
        println("Result: $result")
    }
    catch(e:ArithmeticException) {
        println("An error occured: ${e.message}")
        try {
            val result = calc(10, 2)
            println("Result: $result")
        }
        catch(e:ArithmeticException) {
            println("An error occured again: ${e.message}")
        }
    }
    // Call Method here ----------------------------------------------
}

fun calc(a: Int, b: Int): Int{
    return a / b
}