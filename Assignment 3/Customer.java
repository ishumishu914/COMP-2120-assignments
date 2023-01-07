public class Customer extends Person2
{
    private String customerNum;
    private boolean maillist;

    //constrcutor
    public Customer(String name, String address, String phoneNum, String customerNum, boolean maillist) 
    {
        super(name, address, phoneNum);
        this.customerNum = customerNum;
        this.maillist = maillist;
    }

    //default constructor
    public Customer()
    {
        super();
        this.customerNum = "none";
        this.maillist = false;
    }

    public String getCustomerNum() 
    {
        return this.customerNum;
    }

    public void setCustomerNum(String customerNum) 
    {
        this.customerNum = customerNum;
    }

    public boolean getMaillist() 
    {
        return this.maillist;
    }

    public void setMaillist(boolean maillist) 
    {
        this.maillist = maillist;
    }

    public String toString()
    {
        String t = "";
        if(getMaillist() == true)
        {
            t = "YES";
        }
        else
        {
            t = "NO";
        }

        String s = super.toString() +
                   "\nCustomer number: " + getCustomerNum() +
                   "\nMailing List: " + t;
        return s;
    }
}
