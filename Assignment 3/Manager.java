import java.util.ArrayList;

public class Manager extends Employee
{
    private int bonus;
    ArrayList<Employee> employeeList; 

    public Manager(String firstName, String lastName, String cellNum, String birthDate, int hireYear, int salary, int vacDays, int unVacDays, int bonus)
    {
        super(firstName, lastName, cellNum, birthDate, hireYear, salary, vacDays, unVacDays); //call Employee class contructor
        employeeList = new ArrayList<Employee>();
        this.bonus = bonus;
    }

    public void setBonus(int bonus)
    {
        this.bonus = bonus;
    }

    public int getBonus()
    {
        return bonus;
    }

    public String toString()
    {
        String s = "Monthly bonus: $" + getBonus();
        return super.toString() + s + "\n";
    }
}
