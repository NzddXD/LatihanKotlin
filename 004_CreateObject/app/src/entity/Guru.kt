package app.src.entity

class Guru {
    // Attr
    private var nama : String = "Dr. Doe"
    private var mapel : String = "Chemistry"

    // Method
    fun greet(){
        println("Hello my beloved students! I'm "+ nama + "!")
        print(" Im a new " + mapel + " teacher. I hope we can close each other :3")
    }
}