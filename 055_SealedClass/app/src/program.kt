package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Sealed Class" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val pegawai : Jabatan = Jabatan.MANAGER

    // Change Attr here ----------------------------------------------
    val outpuut = when(pegawai){
        is Jabatan.MANAGER -> "Rank: Manager"
        is Jabatan.DIREKTUR -> "Rank: Direktur"
        is Jabatan.OPERATOR -> "Rank: Operator" 
    }
    // Call Method here ----------------------------------------------
    println(outpuut)
}