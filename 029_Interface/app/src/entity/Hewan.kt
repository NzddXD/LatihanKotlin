package app.src.entity

interface Hewan {
    var nama : String

    fun makan()
    fun infoHewan() = "Nama hewan $nama"
}
