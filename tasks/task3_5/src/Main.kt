// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main(args: Array<String>) 
{
    val filePath = Path("test.txt")
    val fileContents = filePath.readText()
    println(fileContents)
    filePath.writeText(args[0])
}
