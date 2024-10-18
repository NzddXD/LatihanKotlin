package app.src.entity

public class Orang {
    // Public Attr
    var lemari = Lemari()

    // Public Method
    public fun inspectLemari(){
        println("Lihat isi lemari dari package a")
        lemari.isiLemari()
        println("Merk lemari: " +lemari.merk)
    }
}