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
    override fun makan(){
        println("Kucing $name, sedang makan daging dan ikan")
    }
    // Method ini error karena fun 'bernafas' di 'Domba' sudah final dan tidak dapat di override
    // override fun bernafas() = println("Tidak dapat bernafas di air")
}