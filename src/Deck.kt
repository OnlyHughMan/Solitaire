import java.util.*

class Deck {
    val cards: Array<Card> = Array(52, { Card(it % 13, getSuit(it)) })
    var cardsInDeck: MutableList<Card> = cards.toMutableList()

    fun drawCard(): Card = cardsInDeck.removeAt(0)

    fun reset () {
        cardsInDeck = cards.toMutableList()
        Collections.shuffle(cardsInDeck)
    }

    private fun getSuit(i: Int): String = when(i / 13) {
        0 -> CLUBS
        1 -> DIAMONDS
        2 -> HEARTS
        else -> SPADES
    }
}

