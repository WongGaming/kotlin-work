// Task 13.4: Money class
data class Money(val euros: Int, val cents: Int)
{
    init
    {
        if((euros < 0)||(cents < 0))
        {
            throw IllegalArgumentException("Euros and cents must be non-negative")
        }
        if(cents > 99)
        {
            throw IllegalArgumentException("Cents must be less than 100")
        }
    }
    operator fun plus(other: Money): Money
    {
        if (cents + other.cents > 99)
        {
            return Money(euros + other.euros + 1, cents + other.cents - 100)
        }
        else
        {
            return Money(euros + other.euros, cents + other.cents)
        }
    }
}