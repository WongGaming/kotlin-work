// Task 12.4.1: main program
fun main(args: Array<String>)
{
    val a = Circle(Point(0.0, 0.0), args[0].toDouble())
    println(a)
    println(a.area())
    println(a.perimeter())
    val p = Point(5.0, 5.0)
    if (a contains p)
    {
        println("a contains p")
    }
}