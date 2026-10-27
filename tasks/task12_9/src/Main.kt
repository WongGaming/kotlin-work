// Task 12.9: demo program for class implementing Static Factory Method
fun main()
{
    val testPerson = Person.create("John Doe", kotlinx.datetime.LocalDate(1990, 1, 1))

    val testPerson2 = Person.create("John Doe", kotlinx.datetime.LocalDate(1990, 1, 1))
}