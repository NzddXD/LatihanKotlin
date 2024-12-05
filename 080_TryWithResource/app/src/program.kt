package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main() {
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Try-with Resource Exception Handling (Auto Closeable)" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------
    
    // Object Istance here -------------------------------------------

    // Change Attr here ----------------------------------------------
    try {
        DatabaseConnection().use { connection ->
            connection.connect()
            var result = connection.executeQuery("SELECT * FROM users")
            println("Hasil query: $result")
        }
    } catch (e: Exception) {
        println("An error occured: ${e.message}")
    }
    // Call Method here ----------------------------------------------
}