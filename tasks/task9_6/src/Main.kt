// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    try
    {
        val filename = args[0]
        val data = readData(filename)
        val variance = variance(data)
        println("Variance: $variance")  
    }
    catch (error: InvalidFileException)
    {
        println("File does not exist.")
    }
    catch (error: Error)
    {
        println("Something went wrong")
    }
}

class InvalidFileException(message: String) : Exception(message)