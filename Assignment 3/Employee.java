public class Employee extends Person
{
    private int hireYear;
    private int salary;
    private int vacDays;
    private int unVacDays;

    public Employee(String firstName, String lastName, String cellNum, String birthDate, int hireYear, int salary, int vacDays, int unVacDays) 
    {
        super(firstName, lastName, cellNum, birthDate); //call Person class constructor
        this.hireYear = hireYear;
        this.salary = salary;
        this.vacDays = vacDays;
        this.unVacDays = unVacDays;        
    }

    public Employee()
    {
        System.out.println("An employee is created");
    }

    public void setHireYear(int hireYear) 
    {
        this.hireYear = hireYear;
    }

    public void setSalary(int salary) 
    {
        this.salary = salary;
    }

    public void setVacDays(int vacDays) 
    {
        this.vacDays = vacDays;
    }

    public void setUnVacDays(int unVacDays) 
    {
        this.unVacDays = unVacDays;
    }

    public int getHireYear() 
    {
        return hireYear;
    }

    public int getSalary() 
    {
        return salary;
    }

    public int getVacDays() 
    {
        return vacDays;
    }
    public int getUnVacDays() 
    {
        return unVacDays;
    }    

    public String toString()
    {
        String s = "Hire Year: " + getHireYear() + 
                   "\nAnnual Salary: $" + getSalary() + 
                   "\nProvided vacation days: " + getVacDays() +
                   "\nUnused vacation days: " + getUnVacDays() + "\n";
        return super.toString() + s;
    }
}

