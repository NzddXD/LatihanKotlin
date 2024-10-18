package app.src
import app.src.entity.Guru

import Header.title

fun main(){
    
    var title = title()
    title.about = "Memanggil Method : "
    title.header()

    // Object Istance form: Guru.kt
    var guru = Guru()

    // Call Method
    guru.greet() 
}