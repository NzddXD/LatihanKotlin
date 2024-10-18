package app.src.entity

class DaftarBarang : Koleksi<String> {
    var daftar = mutableListOf<String>()

    override fun tambah(item : String){
        daftar.add(item)
    }
    override fun hapus(item : String){
        daftar.remove(item)
    }
    fun daftarKoleksi(){
        println(daftar)
    }
}