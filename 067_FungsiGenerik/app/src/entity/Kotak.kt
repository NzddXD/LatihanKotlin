package app.src.entity

class Kotak<T>(val isi : T) {
    fun tampilkanIsi(){
        println("Isi kotak: $isi")
    }
}