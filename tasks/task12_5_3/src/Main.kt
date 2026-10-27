// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate
fun main()
{
    val me = Person("Kieran", LocalDate(2007, 3, 25))
    me.name = ""
    println(me.name)
}