// Task 12.1: program that uses a Point object
fun main()
{
    val p = Point(1.0, 2.0)
    println("(${p.x}, ${p.y})")
    println(p.distance())
    println(p.distanceTo(Point(2.0, 3.0)))
}