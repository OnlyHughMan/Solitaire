class GameModel {
    val deck = Deck()
    val wastePile: MutableList<Card> = mutableListOf()
    val foundationPiles: Array<FoundationPile> = arrayOf(
            FoundationPile(CLUBS),
            FoundationPile(DIAMONDS),
            FoundationPile(HEARTS),
            FoundationPile(SPADES))
}