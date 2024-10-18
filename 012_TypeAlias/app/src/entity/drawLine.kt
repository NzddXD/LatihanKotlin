package Line

class drawLine {
    var stripe = "-"
    
    fun draw(length : Int){
        for (i in 1..length) {
            print(stripe)
        }
    }
}