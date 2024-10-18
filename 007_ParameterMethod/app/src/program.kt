package app.src

import app.src.entity.Katabaku

import Header.title

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Mengubah Attribut" // <- Ganti yg isi ininya ja
    title.header()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------
    val randInt = (1..100).random()

    val n1 = randInt
    val n2 = randInt

    // Object Istance here -------------------------------------------
    var kelas = Katabaku()

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    println("$n1 + $n2 = " + kelas.add(n1, n2))
    println("$n1 * $n2 = " + kelas.time(n1, n2))
    println("$n1 - $n2 = " + kelas.subtract(n1, n2))
    println("$n1 / $n2 = " + kelas.divide(n1, n2))

}