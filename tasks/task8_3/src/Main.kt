// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val fileOut = fetchData(args[0])
    println(averageTemp(fetchData(args[0])))
}
