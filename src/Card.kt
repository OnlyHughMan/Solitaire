
val CLUBS = "Clubs"
val DIAMONDS = "Diamonds"
val HEARTS = "Hearts"
val SPADES = "Spades"
val redSuits = arrayOf(hearts, diamonds)
val blackSuits = arrayOf(spades, clubs)

class Card(val value: Int, val suit: String, var faceUp: Boolean = false)