// Task 12.8.1: demo program for Day enum class
fun main()
{
    try
    {
        println("Write the day of the week (e.g. Monday, Tuesday, ...):")
        val input = readln()
        val day = Day.valueOf(input)
        println("You entered: $day")
    }
    catch (e: IllegalArgumentException)
    {
        println("Invalid day entered. Input must be one of: ${Day.values().joinToString(", ")}")
    }
}