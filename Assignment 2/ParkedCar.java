public class ParkedCar
{
    private int yearModel; //car's year model
    private String make; //make of car
    private String color;
    private String licenseNum;
    private int mins;

    public ParkedCar(String carmake, int yearmodel, String carcolor, String license, int parkedTime) 
    {
        yearModel = yearmodel;
        make = carmake;
        color = carcolor;
        licenseNum = license;
        mins = parkedTime;
    }

    //mutator methods
    /** setyearModel method
        @param yearmodel    
     */

    public void setyearModel(int yearmodel)
    {
       yearModel = yearmodel;
    }

    /** setMake method
        @param carmake    
     */

    public void setMake(String carmake)
    {
       make = carmake;
    }
    
    public void setColor(String carcolor)
    {
        color = carcolor;
    }

    public void setLicense(String license)
    {
        licenseNum = license;
    }

    public void setParkedMins(int parkedTime)
    {
        mins = parkedTime;
    }

    // accessor methods
    public int getyearModel()
	{
		return yearModel;
	}
	
	public String getMake()
	{
		return make;
	}

    public String getColor()
    {
        return color;
    }

    public String getLicense()
    {
        return licenseNum;
    }

    public int getParkedMins()
    {
        return mins;
    }

    public String toString()
    {
        String s = "Car Data: " 
                    + "\nMake: " + getMake() 
                    + "\nModel: " + getyearModel() 
                    + "\nColor: " + getColor()
                    + "\nLicense Number: " + getLicense()
                    + "\nMinutes parked: " + getParkedMins();
        return s;
    }
}