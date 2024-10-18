package app.src.entity

class Kucing : Hewan() {
    override fun makan(){
        super.makan()
        println("Kucing makan Whiskas!")
    }
}