package app.src
import app.src.entity.*
import Header.title

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Nested Class" // <- Ganti yg isi ininya ja
    title.header()
    // ---------------------------------------------------------------


    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val parentClass = Primary()
    val childrenClass = Primary().Secondary()

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    println(parentClass.greet())
    println(childrenClass.greet())

}