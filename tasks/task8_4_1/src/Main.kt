// Task 8.4.1: experimenting with sequences

fun main() {
    val numbers = listOf(1, 4, 7, 2, 9, 3, 8)

    val test = numbers.asSequence().filter{ it % 2 != 0 }.map {it * it}
    val result = test.toList()

    println(result)
}
