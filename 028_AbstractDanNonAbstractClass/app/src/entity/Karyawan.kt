package app.src.entity
import app.src.entity.Orang

// Attr here -----------------------------------------

// ---------------------------------------------------

class Karyawan(_nama : String):Orang(_nama) {
    override var usia : Int = 0

    override fun setUsiaOrang(_usia : Int){
        usia = _usia
    }
    override fun getUsiaOrang():Int {
        return usia
    }
}