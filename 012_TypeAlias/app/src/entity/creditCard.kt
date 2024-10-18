package creditCardSys

// Attr here -----------------------------------------
typealias Card = String
typealias Pin = Int

class creditCard {
// Method here ---------------------------------------
    fun cardName(card : Card) {
        println("Nama Kartu: " + card)
    }

    fun pass(card : Pin) {
        println("Pin Kartu: " + card)
    }
}