package app.src.entity

class Kotak(private var panjang : Int, private var lebar : Int){
    var setPanjang : Int
    get() = panjang
    set (value) {
        if (value >= 0) {
            panjang = value
        } else {
            println("Number cannot be less than zero!")
        }
    }


    var setLebar : Int
    get() = lebar
    set (value) {
        if (value >= 0){
            lebar = value
        } else {
            println("Number cannot be less than zero!")
        }
    }
}