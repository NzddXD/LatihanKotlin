package app.src.entity

sealed class Hasil() {
    data class Sukses(val data:String):Hasil()
    data class Gagal(val pesan:String):Hasil()

}