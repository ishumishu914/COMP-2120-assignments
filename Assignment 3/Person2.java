/**
 * Person2
 */
public class Person2 
{
    private String name;
    private String address;
    private String phoneNum;
    
    //constructor
    public Person2(String name, String address, String phoneNum) 
    {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    //default constructor
    public Person2()
    {
        this.name = "Name of person undefined";
        this.address = "Address of person undefined";
        this.phoneNum = "Telephone number of person undefined";
    }

    public String getName() 
    {
        return this.name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getAddress() 
    {
        return this.address;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getPhoneNum() 
    {
        return this.phoneNum;
    }

    public void setPhoneNum(String phoneNum) 
    {
        this.phoneNum = phoneNum;
    }

    public String toString()
    {
        String s = "\nName: " + getName() +
                   "\nAddress: " + getAddress() +
                   "\nTelephone: " + getPhoneNum();
        return s;
    }    
}