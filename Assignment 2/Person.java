public class Person 
{
    private String firstName;
    private String lastName;
    private String cellNum;
    private String birthDate;

    public Person(String firstName, String lastName, String cellNum, String birthDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellNum = cellNum;
        this.birthDate = birthDate;
    }

    //default constructor for problem 3
    public Person()
    {
        System.out.println("A person is created...");
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setCellNum(String cellNum)
    {
        this.cellNum = cellNum;
    }

    public void setBirthDate(String birthDate)
    {
        this.birthDate = birthDate;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getCellNum()
    {
        return cellNum;
    }

    public String getBirthDate()
    {
        return birthDate;
    }

    public String toString()
    {
        String s = "\nName: " + getFirstName() + " " + getLastName()
                    + "\nCell number: " + getCellNum()
                    + "\nDate of birth (MM-DD-YYYY): " + getBirthDate().substring(0, 2) + "-"
                                                       + getBirthDate().substring(2, 4) + "-"
                                                       + getBirthDate().substring(4) + "\n";
        return s;
    }
}
