// Task 5.2.1: main program
fun main(args: Array<String>)
{
    val radius = args[0].toDouble()
    println("Perimeter is ${circlePerimeter(radius)}")
    println("Area is ${circleArea(radius)}")
}