// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val text = readln()
    val vowelCount = text.howMany(::isEnglishVowel)
    println("$vowelCount vowels found")
}

fun isEnglishVowel(c: Char) = c.lowercase() in "aeiou"