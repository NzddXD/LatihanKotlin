package app.src.kebun
import app.src.kebun.*

class Bunga {
    // Attr
    var nama = "Bougenville"
    var asal = "United States"
    var manfaat = "Hiasan Rambut"
    var media = Media()

    // Method
    public fun infoBunga(){
        var infoBunga = "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ipsa cum nam quas, sunt sapiente perspiciatis soluta fugiat facilis accusamus pariatur, dolorem voluptatum quod optio praesentium repellendus, deleniti iste aspernatur fuga.";
        println(infoBunga)
    }

    public fun moreInfo(){
        println("Nama Bunga: ")
        println("Asal Bunga: ")
        println("Manfaat Bunga: ")

        println("Media Tanam: " + media.mediaTanam)
        println("Jenis Tanah: " + media.mediaTanam)
        println("Jenis Tempat: " + media.mediaTempat)

        println("Lokasi Penyimpanan: " + media.letakPenyimpanan)
    }
}