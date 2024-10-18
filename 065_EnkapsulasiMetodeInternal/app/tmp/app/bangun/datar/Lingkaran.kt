package app.bangun.datar

class lingkaran {
    internal var jariJari : Int = 0

    fun getAlas():Int{
        return jariJari
    }
    fun setAlas(nilai : Int){
        jariJari = if (nilai >= 0) nilai else 0
    }

    // Hitung luas
    fun hitungLuas():Double{
        return 3.14 * jariJari * jariJari
    }
}