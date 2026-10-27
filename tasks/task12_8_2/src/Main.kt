// Task 12.8.2: program to manipulate playing cards
fun main()
{
    val cards = List(52) { i ->
        val rank = Rank.values()[i % 13]
        val suit = Suit.values()[i / 13]
        Card(rank, suit)
    }
    cards.shuffled().forEach { println(it.fullName) }
    for (card in cards)
    {
        println(card.fullName)
        println(card.toString())
    }
}