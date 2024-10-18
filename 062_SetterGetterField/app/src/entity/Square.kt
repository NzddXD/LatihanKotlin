package app.src.entity

class Kotak(public var panjang : Int, public var lebar : Int){
    var setPanjang : Int = 0
    get() = field
    set (value) {
        field = if (value >= 0) value else 0
    }

    var setLebar : Int = 0
    get() = field
    set (value) {
        field = if (value >= 0) value else 0
    }
}