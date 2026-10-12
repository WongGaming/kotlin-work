// Task 5.1.2: rollDie() function
import kotlin.random.Random


fun rollDie() 
{
    println("Rolling a d6...")
    val result = Random.nextInt(1, 7)
    println("You rolled $result")
}