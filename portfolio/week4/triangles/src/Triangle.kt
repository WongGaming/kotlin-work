// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

//typealias Triangle = Triple<Double,Double,Double>
class Triangle(val sideA: Double, val sideB: Double, val sideC: Double)
{
    init
    {
        if (!isValidTriangle(Triple(sideA, sideB, sideC)))
        {
            throw IllegalArgumentException("Invalid triangle sides")
        }
    }

    val perimeter = sideA + sideB + sideC
    val semiPerimeter = perimeter / 2.0
    val area = triangleArea(Triple(sideA, sideB, sideC))

    override fun toString(): String
    {
        return("Triangle($sideA, $sideB, $sideC)")    
    }
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
        if (!isValidTriangle(sides))
        {
            throw IllegalArgumentException("Invalid triangle sides")
        }
        val (side1, side2, side3) = sides
        val semiPerimeter = 0.5 * (side1 + side2 + side3)
        val area = kotlin.math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3))
        return area
    }
}
