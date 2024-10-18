package app.src.entity
import app.src.entity.Domba

// Attr here -----------------------------------------

// ---------------------------------------------------

class Kucing(name:String):Domba(name) {
    // Kucing mewarisi semua atribut/method yang ada di kelas Domba

    // Kita juga bisa menambahkan fitur tambahan. Misal kita tambahkan fitur melakukan sesuatu
    fun act(act:String){
        print(" dan $name sedang $act")
    }
}