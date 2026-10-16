// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

fun isValidTriangle(sides: Triple<Double, Double, Double>): Boolean
{
    val (a, b, c) = sides

    if(a + b > c && b + c > a && a + c > b )
    {
        return true
    }
    return false
}
fun triangleArea(sides: Triple<Double, Double, Double>): Double
{
    val (side1, side2, side3) = sides
    val semiPerimeter = 0.5 * (side1 + side2 + side3)
    val area = kotlin.math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3))
    return area
}
// Add isValidTriangle() and triangleArea() functions here
