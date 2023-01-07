public class CarDemo 
{
    public static void main(String[] args)
    {
        Car car1 = new Car("Hyundai", 2016);

        System.out.println("Current status of the car:-");
        System.out.println("Year model:  " + car1.getyearModel());
        System.out.println("Make:  " + car1.getMake());
        System.out.println("Speed:  " + car1.getSpeed());
        System.out.println("Accelerating...");

        for (int i = 1; i <= 5; i++)
		{
			car1.accelerate();	
		}
        System.out.println("Now the speed is " + car1.getSpeed());
        
        System.out.println("Braking...");
		
        for (int i = 1; i <= 5; i++)
		{
			car1.brake();
		}
        System.out.println("Now the speed is " + car1.getSpeed());
	
    }
}
