// Task 12.1: Point class
import kotlin.math.hypot
class Point(var x: Double, var y: Double)
{
    fun distance() = hypot(x, y)
    fun distanceTo(point2: Point) = hypot((point2.x - x), (point2.y - y))
}