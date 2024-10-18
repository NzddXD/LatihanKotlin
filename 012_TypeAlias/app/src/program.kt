package app.src

import creditCardSys.creditCard
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?
typealias KartuAtm = creditCard

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Membuat Type Alias" // <- Ganti yg isi ininya ja
    title.header()
    // ---------------------------------------------------------------


    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    var kartu = KartuAtm()

    // Change Attr here ----------------------------------------------

    // Call Method here ----------------------------------------------
    kartu.cardName("VISA")
    kartu.pass(87239)
}