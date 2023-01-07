public class CargoShip extends Ship 
{
    private int capacity;

    public CargoShip(String name, String builtYear, int capacity) 
    {
        super(name, builtYear);
        this.capacity = capacity;
    }

    public int getCapacity() 
    {
        return this.capacity;
    }

    public void setCapacity(int capacity) 
    {
        this.capacity = capacity;
    }

    @Override
    public String toString()
    {
        return "\nShip name: " + getName() + "\nCargo capacity: " + getCapacity() + " tons";
    }
}
