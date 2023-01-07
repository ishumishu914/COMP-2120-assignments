import java.util.ArrayList;

public class Company 
{
    private String companyName;
    private int startYear;
    ArrayList<Manager> managers = new ArrayList<Manager>();
    ArrayList<Employee> employees= new ArrayList<Employee>();

    public Company(String companyName, int startYear, Manager[] mang, Employee[] emp)
    {
        this.companyName = companyName;
        this.startYear = startYear;

        for (int i = 0; i < mang.length; i++) 
        {
            managers.add(mang[i]);        
        }
        for (int i = 0; i < emp.length; i++) 
        {
            employees.add(emp[i]);        
        }
         
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public void setStartYear(int startYear)
    {
        this.startYear = startYear;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public int getStartYear()
    {
        return startYear;
    }

    public String toString()
    {
        String c = "";
        c = "Company name: " + getCompanyName()+
            "\nStarting year: " + getStartYear() + "\n\n";
        return c + "Managers:-\n" + managers.toString() + "\n\nEmployees:-\n" + employees.toString(); 
    }
}
