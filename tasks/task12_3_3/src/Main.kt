// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate
fun main() {
    val p = Person("John", LocalDate(1990, 5, 15))
    println("${p.name} was born on ${p.birth}. Married: ${p.isMarried}")
    val birthDate = LocalDate(1997, 8, 23)
    val marriedPerson = Person("Joe", birthDate).apply{
        isMarried = true
    }
    println("${marriedPerson.name} was born on ${marriedPerson.birth}. Married: ${marriedPerson.isMarried}")
}