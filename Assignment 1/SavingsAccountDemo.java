import java.util.Scanner;

public class SavingsAccountDemo 
{
    public static void main(String[] args) 
    {
        double accountBalance, interestRate;
        int month;

        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter the savings account's starting balance: ");
        accountBalance = keyboard.nextDouble();

        System.out.print("Enter the savings account's annual interest rate: ");
        interestRate = keyboard.nextDouble();

        System.out.print("How many months have passed since the account was opened? ");
        month = keyboard.nextInt();
    
        SavingsAccount savingsAccount = new SavingsAccount(accountBalance, interestRate);

        double montlyDeposit;
        double monthlyWithdrawl;
        double interestEarned = 0.0;
        double totalDeposits = 0;
        double totalWithdrawn = 0;

        for(int i = 1; i <= month; i++)
        {
            System.out.print("Enter the amount deposited during month " + i + ": ");
            montlyDeposit = keyboard.nextDouble();
            totalDeposits += montlyDeposit;
            savingsAccount.Deposit(montlyDeposit);

            System.out.print("Enter amount withdrawn for month" + i + ": ");
            monthlyWithdrawl = keyboard.nextDouble();
            totalWithdrawn += monthlyWithdrawl;
    
            savingsAccount.Withdraw(monthlyWithdrawl);
            savingsAccount.MonthlyInterest();
    
            // Accumulate the amount of interest earned.
            interestEarned += savingsAccount.getMonthlyInterestEarned();
        }
        keyboard.close();

        System.out.printf("Total deposited: $%.2f\n", totalDeposits);
        System.out.printf("Total withdrawn: $%.2f\n", totalWithdrawn);
        System.out.printf("Interest earned: $%.2f\n", interestEarned);
        System.out.printf("Ending balance: $%.2f\n", savingsAccount.getAccountBalance());
    }
}
