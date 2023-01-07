import java.io.IOException;
import java.util.Scanner;
import java.io.*; 

public class DepositAndWithdrawalFiles 
{
    public static void main(String[] args) throws IOException
    {
        double interestRate, interestEarned=0, totald=0 , totalw=0;
        Scanner keyboard = new Scanner(System.in);

        // Ask user to enter annual interest rate
        System.out.print("Enter the savings account's annual interest rate: ");
        interestRate = keyboard.nextDouble();
        keyboard.close();

        SavingsAccount depositAndWithdrawalFiles  = new SavingsAccount(500, interestRate);

        //read deposited amounts from file and store in array
        double[] deposits = new double[4];
        int i=0;
        File depfile = new File("Deposits.txt");
        Scanner file1 = new Scanner(depfile);

        while(file1.hasNext() && i < deposits.length)
        {
            deposits[i] = file1.nextDouble();
            totald += deposits[i];
            i++;
        }
        i=0;
        file1.close();

        //transfer deposit amounts in array to savings account deposits
        depositAndWithdrawalFiles.Deposit(totald);
    
        //read withdrawn amounts from file and store in array
        double[] withdraws = new double[5];
        File witfile = new File("Withdrawals.txt");
        Scanner file2 = new Scanner(witfile);

        while(file2.hasNext() && i < withdraws.length)
        {
            withdraws[i] = file2.nextDouble();
            totalw += withdraws[i];
            i++;
        }
        file2.close();

        //transfer withdrawn amounts in array to savings account withdrawals
        depositAndWithdrawalFiles.Withdraw(totalw);

        depositAndWithdrawalFiles.MonthlyInterest();
        interestEarned = depositAndWithdrawalFiles.getMonthlyInterestEarned();         
        
        System.out.printf("Interest earned: $%.2f\n", interestEarned);
        System.out.printf("Ending balance: $%.2f\n", depositAndWithdrawalFiles.getAccountBalance());
    }
}
