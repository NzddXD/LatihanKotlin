package app.bangun.datar

class Segitiga {
    internal var alas : Int = 0
    internal var tinggi : Int = 0

    // Getter dan Setter (Panjang)
    fun getAlas():Int{
        return alas
    }
    fun setAlas(nilai : Int){
        alas = if (nilai >= 0) nilai else 0
    }

    // Getter dan Setter (Lebar)
    fun getLebar():Int{
        return tinggi
    }
    fun setLebar(nilai : Int){
        tinggi = if (nilai >= 0) nilai else 0
    }

    // Hitung luas
    fun hitungLuas():Int{
        return (alas * tinggi) / 2
    }
}