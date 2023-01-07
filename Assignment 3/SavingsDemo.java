public class SavingsDemo 
{
    public static void main(String[] args) 
    {
        SavingsAccount sAccount = new SavingsAccount(100.00, 0.05);
        System.out.println(sAccount.toString());

        sAccount.deposit(40);
        sAccount.deposit(23);
        sAccount.deposit(7);
        System.out.println(sAccount.toString());

        sAccount.withdraw(100);
        sAccount.withdraw(50);
        System.out.println(sAccount.toString());

        sAccount.deposit(10.00);
        sAccount.withdraw(12.53);
        sAccount.monthlyProcess();
        System.out.println(sAccount.toString());
    }
}
