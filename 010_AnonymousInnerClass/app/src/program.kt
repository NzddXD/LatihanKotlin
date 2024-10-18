package app.src

import app.src.entity.Siswa

import Header.title

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Anonymous Inner Class" // <- Ganti yg isi ininya ja
    title.header()
    // ---------------------------------------------------------------


    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    var nezad : Siswa = object:Siswa {
        // Anonymous class
        override fun quote() = println("I love cats")
    }

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    println(nezad.quote())

}