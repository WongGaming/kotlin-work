// Task 4.7: finding the longest line in a file
import kotlin.io.path.Path
import kotlin.io.path.useLines
fun main(args: Array<String>)
{
    val filePath = Path(args[0])
    var maxLength = 0
    var position = 0
    var highestPosition = 0
    filePath.useLines()
    {
        for (line in it)
        {
            position = position + 1
            if (line.length > maxLength)
            {
                maxLength = line.length
                highestPosition = position
            }
        }
    }
    println("Line $highestPosition is the longest (length = $maxLength)")
}