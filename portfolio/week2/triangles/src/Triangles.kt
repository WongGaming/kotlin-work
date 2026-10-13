// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

fun isValidTriangle(sides: Triple<Double, Double, Double>): Boolean
{
    val (side1, side2, side3) = sides

    val side12 = side1 + side2
    val side13 = side1 + side3
    val side23 = side2 + side3
    if (side12 < side1)
    {
        return false
    }
    if (side12 < side2)
    {
        return false
    }
    if (side13 < side1)
    {
        return false
    }
    if (side13 < side3)
    {
        return false
    }
    if (side23 < side2)
    {
        return false
    }
    if (side23 < side3)
    {
        return false
    }
    return true
}
fun triangleArea(sides: Triple<Double, Double, Double>): Double
{
    val (side1, side2, side3) = sides
    val semiPerimeter = 0.5 * (side1 + side2 + side3)
    val area = kotlin.math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3))
    return area
}
// Add isValidTriangle() and triangleArea() functions here
