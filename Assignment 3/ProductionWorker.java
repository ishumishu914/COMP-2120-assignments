class ProductionWorker extends Employee2
{
    private int shift;
    private double payRate;

    public ProductionWorker() 
    {
        System.out.println("A production worker is created");
    }

    public ProductionWorker(String name, String employeeNum, String hireDate, int shift, double payRate) 
    {
        super(name, employeeNum, hireDate);
        this.shift = shift;
        this.payRate = payRate;
    }

    public int getShift() 
    {
        return this.shift;
    }

    public void setShift(int shift) 
    {
        this.shift = shift;
    }

    public double getPayRate() 
    {
        return this.payRate;
    }

    public void setPayRate(double payRate) 
    {
        this.payRate = payRate;
    }

    public String toString()
    {
        String s = super.toString();
        s += "\nShift: ";

        if (getShift() == 1)
        {
           s += "Day";
        }
        else if (getShift() == 2)
        {
           s += "Night";
        }
        else
        {
           s += "INVALID SHIFT NUMBER";
        }
        
        s += ("\nHourly Pay Rate: $" + getPayRate());
               
        return s;
    }
}