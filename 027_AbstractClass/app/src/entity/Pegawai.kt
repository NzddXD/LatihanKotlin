package app.src.entity
import app.src.entity.Orang

// Attr here -----------------------------------------

// ---------------------------------------------------

class Pegawai:Orang(){
    // Implement attribut dari class abstrak
    override var nama : String = ""
    override var usia : Int = 0
    override var pekerjaan : String = ""

    // Implement method attribut dari class abstrak
    override fun setNamaOrang(_nama : String){
        val new_nama = _nama
        nama = new_nama
    }
    override fun setUsiaOrang(_usia : Int){usia = _usia}
    override fun setPekerjaanOrang(_pekerjaan : String){
        val new_pekerjaan = _pekerjaan
        pekerjaan = new_pekerjaan
    }
    
    override fun getUNamaOrang():String = nama
    override fun getUsiaOrang():Int = usia
    override fun getPekerjaanOrang():String = pekerjaan
}