public class Temperature 
{
    private double ftemp;

    /** Constructor
        @param temp 
     */

    public Temperature(double temp) 
    {
        ftemp = temp;
    }

    //mutator method
    public void setFahrenheit(double temp)
    {
       ftemp = temp;
    }
    
    //accessor methods
    public double getFahrenheit()
    {
        return ftemp;
    }

    public double getCelcius()
    {
        return (5 * (ftemp - 32)) / 9;
    }

    public double getKelvin()
    {
        return ((5 * (ftemp - 32)) / 9) + 273;
    }
}
