public class Ship 
{
    private String name;
    private String builtYear;

    public Ship() 
    {
        this.name = "unknown";
        this.builtYear = "unknown";
    }

    public Ship(String name, String builtYear) 
    {
        this.name = name;
        this.builtYear = builtYear;
    }

    public String getName() 
    {
        return this.name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getBuiltYear() 
    {
        return this.builtYear;
    }

    public void setBuiltYear(String builtYear) 
    {
        this.builtYear = builtYear;
    }
    
    public String toString()
    {
        return "\nShip name: " + getName() + "\nYear built: " + getBuiltYear();
    }
}
