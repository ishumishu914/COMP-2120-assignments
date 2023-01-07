public class PreferredCustomer extends Customer
{
    private double purchase;
    private double discount;

    public PreferredCustomer(String name, String address, String phoneNum, String customerNum, boolean maillist, double purchase) 
    {
        super(name, address, phoneNum, customerNum, true);
        this.purchase = purchase;
    }

    public double getPurchase() 
    {
        return this.purchase;
    }

    public void setPurchase(double purchase) 
    {
        this.purchase = purchase;
    }

    public String toString()
    {
        if (getPurchase() >= 500 && getPurchase() <= 999) 
        {
            discount = 0.05;
        }
        else if (getPurchase() >= 1000 && getPurchase() <= 1499) 
        {
            discount = 0.06;
        }
        else if (getPurchase() >= 1500 && getPurchase() <= 1999) 
        {
            discount = 0.07;
        }
        else if (getPurchase() >= 2000)
        {
            discount = 0.10;
        }

        String s = super.toString() + "\nPurchase: $" + getPurchase() + "\nDiscount level: " + discount;
        return s;
    }
}
