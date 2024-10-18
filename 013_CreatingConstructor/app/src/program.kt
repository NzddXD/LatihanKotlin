package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Membuat Constructor" // <- Ganti yg isi ininya ja
    title.header()
    // ---------------------------------------------------------------


    // Common Vars here ----------------------------------------------


    // Object Istance here -------------------------------------------
    val guru1 = Guru("Ujang Rudini", "P. RPL", "ujang.rudini@gmail.com")
    val guru2 = Guru("Ujang Rudini", "P. RPL", "ujang.rudini@gmail.com")
    val guru3 = Guru("Ujang Rudini", "P. RPL", "ujang.rudini@gmail.com")

    val siswa1 = Siswa("Muhammad Nezad", "P.RPL", "muhammadnezad@gmail.com")
    val siswa2 = Siswa("Muhammad Nezad", "P.RPL", "muhammadnezad@gmail.com")
    val siswa3 = Siswa("Muhammad Nezad", "P.RPL", "muhammadnezad@gmail.com")
    // Change Attr here ----------------------------------------------


    // Call Method here ----------------------------------------------
    guru1.infoGuru()
    guru2.infoGuru()
    guru3.infoGuru()

    siswa1.infoSiswa()
    siswa2.infoSiswa()
    siswa3.infoSiswa()
}