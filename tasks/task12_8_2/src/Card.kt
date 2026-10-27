// Task 12.8.2: class to represent playing cards
class Card(_rank: Rank, _suit: Suit)
{
    val rank = _rank
    val suit = _suit
    val fullName get() = "${rank.name} of ${suit.name}"
    override fun toString() = "${rank.toString()}${suit.toString()}"
}