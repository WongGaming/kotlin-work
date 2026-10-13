// Task 7.3.1: list element access
fun main()
{
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    numbers.add(2)
    println(numbers)
    numbers.addAll(listOf(5,4,3,6,7,8))
    println(numbers)
    numbers.remove(9)
    println(numbers)
    numbers.removeAll(listOf(3))
    println(numbers)
    numbers.removeAt(2)
    println(numbers)
    numbers.clear()
    println(numbers)
}