package app.src.entity

class Kotak {
    var panjang : Int = 0
    var lebar : Int = 0

    // Getter dan Setter Kustom (Panjang)
    var panjangKustom : Int
    get() = panjang
    set(nilai){
        panjang = if (nilai >= 0) nilai else 0
    }

    // Getter dan Setter Kustom (Lebar)
    var lebarKustom : Int
    get() = lebar
    set(nilai){
        lebar = if (nilai >= 0) nilai else 0
    }

    // Hitung luas
    fun hitungLuas():Int{
        return panjang * lebar
    }
    
}