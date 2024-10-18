package Header

class title {
    // Attr
    var bar : String = "---------------------------------------------"
    var title : String = "Lat. "
    var about : String = ""
    var name : String = " : Muhammad Nezad"

    // Method
    fun header(){
        println(bar)
        print(title + about)
        print(name + "\n")
        println(bar)
        println("")
    }
}