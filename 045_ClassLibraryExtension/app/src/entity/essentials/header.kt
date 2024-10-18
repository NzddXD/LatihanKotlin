// I love kimiko five tails :3

package Header

class title {
    // Attr
    var bar : String = "-"
    var title : String = "Lat. "
    var about : String = ""
    var name : String = " : Muhammad Nezad"

    // Method
    public fun header(){
        // Dapatkan length dari semua properti judul
        val allValues = title.length + about.length + name.length
        val titleLength = allValues

        // Lakukan perulangan sesuai length dari properti judul
        for (i in 0..titleLength + 2){
            print(bar)
        }
        println("")

        print(title + about)
        print(name + "\n")

        // And so on..
        for (i in 0..titleLength + 2){
            print(bar)
        }
        println("")

        println("")
    }
}