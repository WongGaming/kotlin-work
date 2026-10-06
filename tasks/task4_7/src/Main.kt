// Task 4.7: finding the longest line in a file
fun main()
{
    val filePath = ""
    var highest = 0
    filePath.useLines
    {
        for (line in it)
        {
            if (line.length > highest)
            {
                highest = line.length
                
            }
        }
    }
}