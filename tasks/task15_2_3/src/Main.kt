// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val saving = SavingsAccount("John Doe", 1.8)
    saving.deposit(1250)
    println("Balance before interest: ${saving.balance}")
    for (i in 1..5) {
        saving.applyInterest()
    }
    println("Balance after 5 years of interest: ${saving.balance}")
    saving.withdraw(50)
    println("Balance after withdrawal: ${saving.balance}")
}
