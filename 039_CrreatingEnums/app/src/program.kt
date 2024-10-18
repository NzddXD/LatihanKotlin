package app.src

import app.src.entity.*
import Header.title
import Line.drawLine // Draw a stripes bcuz why not?

fun main(){
    // ------------- Jangan Hapus section ini pelis ------------------
    var title = title()
    title.about = "Membuat Enum" // <- Ganti yg isi ininya ja
    title.header()

    /* -------------------- IMPORTANT STUFF ------------------------ */
    val line = Line.drawLine()
    // ---------------------------------------------------------------

    // Common Vars here ----------------------------------------------

    // Object Istance here -------------------------------------------
    val today = hariDalamSeminggu.SABTU

    // Change Attr here ----------------------------------------------

    val msg = when(today) {
        hariDalamSeminggu.SABTU, hariDalamSeminggu.MINGGU -> "Libur yeyeyeyeyeyey :) :D"
        hariDalamSeminggu.SENIN -> "Dih udah senin aja, NAJISS"
        hariDalamSeminggu.SELASA, hariDalamSeminggu.RABU, hariDalamSeminggu.KAMIS -> "oh my god oh hell naw man wtf man get yo ass off bruh"
        hariDalamSeminggu.JUMAT -> "boutta make it till friday ahh blud"
    }

    // Call Method here ----------------------------------------------
    println("Hari ini: $today, $msg")
    line.line(34)
}