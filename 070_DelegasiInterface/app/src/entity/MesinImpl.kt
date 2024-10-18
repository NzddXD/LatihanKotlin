package app.src.entity

class MesinImpl : Mesin {
    override fun start(){
        println("Mesin Berjalan.")
    }
    override fun stop(){
        println("Mesin Berhenti.")
    }
}