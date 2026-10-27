// Task 7.7.1: statistics functions
fun median(input: List<Float>): Float
{
    if (input.count() % 2 == 0)
    {
        val middle = input[(input.count() / 2) - 1]
        var evenMiddle = input[((input.count()/2) + middle)/2]
        return evenMiddle
    }
    else
    {
        val middle = input[(input.count() + 1)/2]
        return middle
    }
}