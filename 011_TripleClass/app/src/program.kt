package app.src

// import app.src.entity
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Triple CLass" // <- Ganti yg isi ininya ja
    title.header()
    // ---------------------------------------------------------------


    // Common Vars here ----------------------------------------------
    var tripleVal = Triple("Nezad", "Boy", "Bandung")
    val (v1, v2, v3) = Triple(2, "Nezad Lagi", "Bandung Lagi")

    // Object Istance here -------------------------------------------
    var stripe = drawLine()
    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    println("Nama: " + tripleVal.first)
    println("Gender: " + tripleVal.second)
    println("Alamat: " + tripleVal.third)
    stripe.line(45)
    println("")
    println("No: " + v1)
    println("Nama: " + v2)
    println("Alamat: " + v3)
}