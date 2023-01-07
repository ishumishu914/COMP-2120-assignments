public class SavingsAccount 
{
    private double annualInterestRate;
    private double balance;
    private double interestEarned;

    public SavingsAccount(double startingBalance, double interestRate)
    {
        balance = startingBalance;
        annualInterestRate = interestRate;
    }

    public double getAccountBalance() 
    {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void Withdraw(double withdrawAmount)
    {
        balance -= withdrawAmount;
    }

    public void Deposit(double depositAmount)
    {
        balance += depositAmount;
    }

    public void MonthlyInterest()
    {
        double monthlyInterest = annualInterestRate/12;
        interestEarned = monthlyInterest * balance;
        balance += interestEarned;
    }    
    
    public double getMonthlyInterestEarned() 
    {
        return interestEarned;
    }
}
