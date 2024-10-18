package Line

class drawLine {
    var stripe = "-"
    
    fun line(length : Int){
        for (i in 1..length) {
            print(stripe)
        }
    }
}