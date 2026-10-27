// Task 7.7.1: statistics functions
fun median(input: List<Float>): Float
{
    if (input.isEmpty())
    {
        throw IllegalArgumentException("Input list is empty")
    }
    val sorted = input.sorted()
    val middle = sorted.size / 2

    if (sorted.size % 2 == 0) 
    {
        return (sorted[middle - 1] + sorted[middle]) / 2f
    } 
    else 
    {
        return sorted[middle]
    }
}


// require(input.isNotEmpty()) { "Input list is empty" }

//     val sorted = input.sorted()
//     val middle = sorted.size / 2

//     return if (sorted.size % 2 == 0) {
//         (sorted[middle - 1] + sorted[middle]) / 2f
//     } else {
//         sorted[middle]
//     }
// }