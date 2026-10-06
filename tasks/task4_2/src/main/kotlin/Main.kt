// Task 4.2: use of if and ranges

fun main() {
    println("Pick your pizza option a, b, c, d")
    var userInput = readln().lowercase()
    if (userInput.length == 1 && userInput[0] in 'a'..'d')
    {
        println("Order accepted")
    }
    else
    {
        println("Invalid choice!")
    }
}
