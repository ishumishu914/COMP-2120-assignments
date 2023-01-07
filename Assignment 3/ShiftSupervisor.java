public class ShiftSupervisor extends Employee2
{
    private double salary;
    private double bonus;

    public ShiftSupervisor(String name, String employeeNum, String hireDate, double salary, double bonus) 
    {
        super(name, employeeNum, hireDate);
        this.salary = salary;
        this.bonus = bonus;
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
    }

    public double getSalary() 
    {
        return this.salary;
    }

    public void setBonus(double bonus) 
    {
        this.bonus = bonus;
    }    

    public double getBonus() 
    {
        return this.bonus;
    }

    @Override
    public String toString() 
    {
        String s = super.toString();
        s += "\nAnnual Salary: $" + getSalary() + "\nProduction Bonus: $" + getBonus();
        return s;
    }
}
