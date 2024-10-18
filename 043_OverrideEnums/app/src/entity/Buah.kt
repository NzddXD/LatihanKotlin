package app.src.entity

enum class Buah(val nama: String) {
    APPLE("Apple") {
        override fun desc(): String {
            return "This thing is crazy"
        }
    },
    BANANA("Banana") {
        override fun desc(): String {
            return "Peak fruit fw this 10/10"
        }
    },
    ORANG("Orange") {
        override fun desc(): String {
            return "annoying orang"
        }
    };

    abstract fun desc(): String
}
