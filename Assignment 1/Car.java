public class Car 
{
    private int yearModel; //car's year model
    private String make; //make of car
    private int speed; //car's current speed

    /** Constructor
        @param yearmodel
        @param carmake    
     */

    public Car(String carmake, int yearmodel) 
    {
        yearModel = yearmodel;
        make = carmake;
        speed = 0;
    }

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
    
    // accessor methods
    public int getyearModel()
	{
		return yearModel;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public int getSpeed()
	{
		return speed;
	}	

    public void accelerate()
	{
		speed += 5;
	}
	
	public void brake()
	{
        speed -= 5;
	}
}
