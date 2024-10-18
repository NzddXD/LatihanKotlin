package app.src

// import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Batasan Generik" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------

    // Change Attr here ----------------------------------------------
    val daftarKata = listOf("Hello!", "Selamat", "Pagi")
    val gabungan = gabung(daftarKata, " ")

    // Call Method here ----------------------------------------------
    println(gabungan)
    line.line(20)
}
fun <T> gabung(daftar : List<T>, pemisah : String) : String where T : CharSequence {
    return daftar.joinToString(separator = pemisah)
}