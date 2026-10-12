// Task 5.3.2: main program
fun main(args: Array<String>)
{
    var splitArg = args[0].split("d")
    val sides = splitArg[1].toInt()
    val numberOfDice = splitArg[0].toInt()
    rollDice(sides = sides, numberOfDice = numberOfDice)
}