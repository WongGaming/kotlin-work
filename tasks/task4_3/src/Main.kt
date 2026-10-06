// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
fun main(args: Array<String>)
{
    if (args.size <= 2)
    {
        println("You need 3 command line arguments.")
        exitProcess(1)
    }
    val a = args[0].toInt()
    val b = args[1].toInt()
    val c = args[2].toInt()

    val total = a+b+c
    val mean = total/3
    val output = when (mean)
    {
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 80..100 -> "Distinction"
        else -> "?"
    }

    println(output)
}