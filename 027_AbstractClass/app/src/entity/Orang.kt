package app.src.entity

// Attr here -----------------------------------------

// ---------------------------------------------------
abstract class Orang{
    // Attribut abstrak
    abstract var nama : String
    abstract var usia : Int
    abstract var pekerjaan : String

    // Method
    abstract fun setNamaOrang(_nama : String)
    abstract fun getUNamaOrang():String

    abstract fun setUsiaOrang(_usia : Int)
    abstract fun getUsiaOrang():Int

    abstract fun setPekerjaanOrang(_pekerjaan : String)
    abstract fun getPekerjaanOrang():String
}