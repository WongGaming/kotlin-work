// Task 5.3.2: rollDice() function
import kotlin.random.Random
fun rollDice(sides: Int = 6, numberOfDice: Int = 1)
{
    println("Rolling $numberOfDice d$sides...\n")
    for (n in 0..numberOfDice)
    {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
}