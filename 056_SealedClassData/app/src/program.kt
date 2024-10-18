package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    val title = title()
    title.about = "Membuat Sealed Class Data" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val sukses = Hasil.Sukses("Data berhasil dimuat")
    val gagal = Hasil.Gagal("Gagal memuat data")

    // Change Attr here ----------------------------------------------
    
    // Call Method here ----------------------------------------------
    prosesHasil(sukses)
    prosesHasil(gagal)
}

fun prosesHasil(hasil:Hasil){
    when (hasil) {
        is Hasil.Sukses -> println("Sukses! " + hasil.data)
        is Hasil.Gagal -> println("Gagal! " + hasil.pesan)
    }
}