package app.src

import app.src.entity.Guru

import Header.title

fun main(){
    // Jangan Hapus section ini pelis
    var title = title()
    title.about = "Mengubah Attribut" // <- Ganti yg isi ininya ja
    title.header()

    // Object Istance form: Guru.kt
    var guru = Guru()

    // Change Attr
    guru.nama = "Ms. Circle"
    guru.mapel = "Spanish"

    // Call Method
    guru.greet() 
}