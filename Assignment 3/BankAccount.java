
public class BankAccount 
{
    private double balance;
    private int deposit = 0;
    private int withdrawal = 0;
    private double interestRate;
    private double serviceCharge;

    public BankAccount(double balance, double interestRate)
    {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public BankAccount()
    {
        this.balance = 0.0;
        this.interestRate = 0.0;
    }

    public double getBalance() 
    {
        return this.balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public int getDeposit() 
    {
        return this.deposit;
    }

    public void setDeposit(int deposit) 
    {
        this.deposit = deposit;
    }

    public int getWithdrawal() 
    {
        return this.withdrawal;
    }

    public void setWithdrawal(int withdrawal) 
    {
        this.withdrawal = withdrawal;
    }

    public double getInterestRate() 
    {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) 
    {
        this.interestRate = interestRate;
    }

    public double getServiceCharge() 
    {
        return this.serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) 
    {
        this.serviceCharge = serviceCharge;
    }

    public void deposit(double depositAmount)
    {
        balance += depositAmount;
        deposit++;
    }

    public void withdraw(double withdrawAmount)
    {
        balance -= withdrawAmount;
        withdrawal++;
    }

    public void calcInterest()
    {
        double monthlyRate = interestRate / 12;
        double monthlyInterest = balance * monthlyRate;
        balance += monthlyInterest;
    }

    public void monthlyProcess()
    {
        balance -= getServiceCharge();
        calcInterest();
        withdrawal = 0;
        deposit = 0;
        serviceCharge = 0;
    }

    public String toString()
    {
        String s = String.format("\nBalance: $%.2f", getBalance()) +
                   "\nNumber of deposits: " + getDeposit() +
                   "\nNumber of withdrawals: " + getWithdrawal();
        return s;
    }
}
