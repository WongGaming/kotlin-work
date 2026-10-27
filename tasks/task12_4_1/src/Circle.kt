// Task 12.4.1: Circle class
import kotlin.math.PI
class Circle(val centre: Point, val radius: Double)
{
    init
    {
        require(radius > 0) { "Radius must be positive" }
    }
    
    fun area(): Double = PI * radius * radius
    fun perimeter(): Double = 2 * PI * radius

    infix fun contains(p: Point): Boolean = !(((p.x - centre.x) * (p.x - centre.x) + (p.y - centre.y) * (p.y - centre.y)) > radius * radius)
}