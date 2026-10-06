// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) 
{
    if (args.size != 1)
    {
        println("You need 1 command line argument.")
        exitProcess(1)
    }    
    val startNumber = 1
    val x = args[0].toInt()
    var total = 0
    for (n in 1..x)
    {
        if (n % 2 != 0)
        {
            total = total + n
            println(total)
        }
    }
}
