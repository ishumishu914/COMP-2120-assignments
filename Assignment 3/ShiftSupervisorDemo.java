public class ShiftSupervisorDemo 
{
    public static void main(String[] args) 
    {
        ShiftSupervisor[] supervisor = new ShiftSupervisor[]{
            new ShiftSupervisor("John Smith", "123-A", "11-15-2005", 48000.00, 6500.00),
            new ShiftSupervisor("Joan Jones", "222-L", "12-12-2005", 55000.00, 8000.00)
        };

        System.out.println("\nHere's the first shift supervisor.");
        System.out.println(supervisor[0].toString());

        System.out.println("\nHere's the second shift supervisor.");
        System.out.println(supervisor[1].toString());
    }   
}
