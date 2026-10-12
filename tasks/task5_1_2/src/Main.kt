// Task 5.1.2: main program
import kotlin.random.Random
fun main()
{
    for (n in 1..5)
    {
        rollDie(Random.nextInt(1, 21))
    }
}