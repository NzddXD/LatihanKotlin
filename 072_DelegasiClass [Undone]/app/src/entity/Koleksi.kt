package app.src.entity

interface Koleksi <T> {
    fun tambah(item : T)
    fun hapus(item : T)
}