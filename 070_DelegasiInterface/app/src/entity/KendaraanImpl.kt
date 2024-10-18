package app.src.entity

class KendaraanImpl:Kendaraan{
    private val mesin:Mesin = MesinImpl()

    override fun start(){
        mesin.start()
    }

    override fun stop(){
        mesin.stop()
    }

    override fun bergerak(){
        start()
        println("Kendaraan Bergerak.")
    }

    fun parkir(){
        stop()
        println("Kendaraan Berhenti.")
    }
}