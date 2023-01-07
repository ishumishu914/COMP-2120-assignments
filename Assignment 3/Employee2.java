public class Employee2 
{
    private String name;
    private String employeeNum;
    private String hireDate;
    
    public Employee2(String name, String employeeNum, String hireDate)
    {
        this.name = name;
        this.employeeNum = employeeNum;
        this.hireDate = hireDate;
    }

    public Employee2()
    {
        System.out.println("An employee is created");
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName() 
    {
        return this.name;
    }

    public void setEmployeeNum(String employeeNum)
    {
        this.employeeNum = employeeNum;
    }

    public String getEmployeeNum() 
    {
        return this.employeeNum;
    }

    public String getHireDate() 
    {
        return this.hireDate;
    }

    public void setHireDate(String hireDate) 
    {
        this.hireDate = hireDate;
    }

    public String toString()
    {
        String str = "Name: " + name + "\nEmployee Number: ";
      
        if (employeeNum == "")
        {
            str += "INVALID EMPLOYEE NUMBER";
        }
        else
        {
           str += employeeNum;
        }
        
        str += ("\nHire Date: " + hireDate);
        return str;
    }
}
