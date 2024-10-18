package app.src

import app.bangun.datar.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Enkapsulasi Metode Internal" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val persegiPanjang = PersegiPanjang()
    val segitiga = Segitiga()
    val lingkaran = lingkaran()

    // Change Attr here ----------------------------------------------
    persegiPanjang.setPanjang(5)
    persegiPanjang.setLebar(3)
    
    segitiga.setAlas(7)
    segitiga.setLebar(3) // setTinggi()

    lingkaran.setAlas(6)

    // Call Method here ----------------------------------------------
    println("Luas Persegi Panjang: ${persegiPanjang.hitungLuas()}")
    line.line(18)
    println("Luas Lingkaran: ${lingkaran.hitungLuas()}")
    line.line(18)
    println("Luas Segitiga: ${segitiga.hitungLuas()}")
    line.line(18)
}