/* 
- To report the make, model, color, and license number of the illegally parked car 
- To report the amount of the fine, which is $25 for the first hour or part of an hour that the 
car is illegally parked, plus $10 for every additional hour or part of an hour that the car is 
illegally parked 
- To report the name and badge number of the police officer issuing the ticket
*/
public class ParkingTicket 
{
    private ParkedCar car;
    private ParkingMeter meter;
    private PoliceOfficer cop;
    private double fine; //used to calculate fine in PoliceOfficer class

    public ParkingTicket(ParkedCar car, PoliceOfficer cop, ParkingMeter meter)
    {
        this.car = car;
        this.cop = cop; 
        this.meter = meter;
    }

    public void calculateFine() 
    {
        int extramins = car.getParkedMins() - meter.getPurchaseTime();
        if ( extramins <= 60) 
        {
            fine = 25;    //base fine
        }
        else 
        {
            fine = 25 + (10 * (double)(extramins/60));      //extra fine if passed 1hr
        }
    }

    public String toString()
    {
        String s = car.toString() + cop.toString() 
                    + "\n\nMinutes illegally parked: " + (car.getParkedMins() - meter.getPurchaseTime())
                    + "\nFine: $" + String.format("%.2f", fine);
        return s;
    }
}
