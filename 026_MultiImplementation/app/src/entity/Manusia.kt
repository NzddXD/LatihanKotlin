package app.src.entity
import app.src.entity.*

// Attr here -----------------------------------------

// ---------------------------------------------------
class Manusia:Kucing(), Sapi{

    override fun infoMakan(){
        super<Kucing>.infoMakan()
        super<Sapi>.infoMakan()
    }
}