// Task 15.2.3: SavingsAccount class
class SavingsAccount(holder: String, val rate: Double): BankAccount(holder)
{
    init
    {
        require(rate > 0.0) 
        {
            "Interest rate needs to be greater than 0."
        }
    }
    fun applyInterest()
    {
        val ratePercentage = rate/100
        deposit((ratePercentage * balance).toInt())
    }
}