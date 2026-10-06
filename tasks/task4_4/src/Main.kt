// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) 
{
    if (args.size <= 2)
    {
        println("You need 3 command line arguments.")
        exitProcess(1)
    }
    val startCelsius = args[0].toFloat()
    val endCelsius = args[1].toFloat()
    val incrementCelcius = args[2].toFloat()
    var farenheit = 0f
    var i = startCelsius
    println("       Celcius        |       Farenheit       ")
    while (i <= endCelsius)
    {
        farenheit = ((i * 1.8) + 32).toFloat()
        println("       ${"%.1f".format(i)}        |       ${"%.1f".format(farenheit)}       ")
        i = i + incrementCelcius
    }
}