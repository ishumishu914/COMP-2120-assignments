public class CruiseShip extends Ship
{
    private int maxPassenger;

    public CruiseShip(String name, String builtYear, int maxPassenger) 
    {
        super(name, builtYear);
        this.maxPassenger = maxPassenger;
    }

    public int getMaxPassenger() 
    {
        return this.maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) 
    {
        this.maxPassenger = maxPassenger;
    }

    @Override
    public String toString()
    {
        return "\nShip name: " + getName() + "\nMaximum number of passengers: " + getMaxPassenger();
    }
}
