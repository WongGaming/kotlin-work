// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate
fun main()
{
    val me = Person("Kieran", LocalDate(2007, 3, 25))
    println(me.age)
}