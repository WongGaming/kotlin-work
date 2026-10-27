// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate
fun main()
{
    val person = Person("John", LocalDate(1990, 1, 1))
    println(person.name)
}