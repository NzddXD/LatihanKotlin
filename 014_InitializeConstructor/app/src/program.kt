package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Inisialisasi Constructor" // <- Ganti yg isi ininya ja
    title.header()
    // ---------------------------------------------------------------


    // Common Vars here ----------------------------------------------


    // Object Istance here -------------------------------------------
    val cat1 = Kucing("Kiti", 2, "Angora")
    val cat2 = Kucing("Garong", 1, "Persia")
    val cat3 = Kucing("Oren", 3, "Kocheng Oren")

    val stripe = drawLine()
    // Change Attr here ----------------------------------------------


    // Call Method here ----------------------------------------------
    print("${cat1.nama} bersuara: ")
    cat1.suara("Meow")

    stripe.line(45)
    println("")

    print("${cat2.nama} bersuara: ")
    cat1.suara("Myaw")

    stripe.line(45)
    println("")

    print("${cat3.nama} bersuara: ")
    cat1.suara("MMMMMMmmmmmmmmmmmmmmmmmmm")

    stripe.line(45)
    println("")
}