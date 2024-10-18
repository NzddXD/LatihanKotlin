package app.src.entity

class Kotak {
    private var panjang : Int = 0
    private var lebar : Int = 0

    // Getter dan Setter (Panjang)
    fun getPanjang():Int{
        return panjang
    }
    fun setPanjang(nilai : Int){
        panjang = if (nilai >= 0) nilai else 0
    }

    // Getter dan Setter (Lebar)
    fun getLebar():Int{
        return lebar
    }
    fun setLebar(nilai : Int){
        lebar = if (nilai >= 0) nilai else 0
    }

    // Hitung luas
    fun hitungLuas():Int{
        return panjang * lebar
    }
    
}