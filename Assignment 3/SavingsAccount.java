public class SavingsAccount extends BankAccount
{
    private boolean status;

    public SavingsAccount(double balance, double interestRate)
    {
        super(balance, interestRate);
        if (balance < 25) 
        {
            status = false;    
        }
        else
        {
            status = true;
        }
    }

    public boolean getStatus() 
    {
        return status;    
    }

    public void withdraw(double withdrawAmount)
    {
        if (status == false) 
        {
            System.out.println("Account Inactive! No Withdrawals can be made.");
        }
        else
        {
            if (getBalance() >= withdrawAmount) 
            {
                super.withdraw(withdrawAmount);
                if (getBalance() <= 25) 
                {
                    status = false;    
                }
            }
        }
    }

    public void deposit(double depositAmount)
    {
        if (status == false) 
        {
            if ((getBalance() + depositAmount) > 25) 
            {
                status = true;
            }
        }
        super.deposit(depositAmount);
    }

    public void monthlyProcess()
    {
        if (getWithdrawal() > 4) 
        {
            for (int i = 0; i < (getWithdrawal() - 4); i++) 
            {
                setServiceCharge(1.0);
            }
        }

        if (getBalance() < 25) 
        {
            status = false;    
        }
        super.monthlyProcess();
    }

    public String toString()
    {
        return super.toString();
    }
}
