/* - To examine a ParkedCar object and a ParkingMeter object, and determine whether 
the car's time has expired 
- To issue a parking ticket (generate a ParkingTicket object) if the car's time has 
expired
 */
public class PoliceOfficer 
{
    private String officerName;
    private int badgeNum;

    public PoliceOfficer(String name, int badge)
    {
        officerName = name;
        badgeNum = badge;
    }

    public void setName(String name)
    {
        officerName = name;
    }

    public void setBadge(int badge)
    {
        badgeNum = badge;
    }

    public String getName() 
    {
        return officerName;
    }

    public int getBadge()
    {
        return badgeNum;
    }

    //check if car has passed time limit
    public boolean isIllegalParked(ParkedCar car, ParkingMeter mins)
    {
        if (car.getParkedMins() > mins.getPurchaseTime()) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public ParkingTicket writeTicket(ParkedCar car, ParkingMeter mins)
    {
        ParkingTicket ticket = null;
        int extraMins = car.getParkedMins() - mins.getPurchaseTime();
        
        if (extraMins > 0) 
        {
            ticket = new ParkingTicket(car, this, mins); //parking ticket given only if parked longer than allocated time
        }
        return ticket;
    }

    public String toString()
    {
        return "\n\nOfficer Data: " 
             + "\nName: " + getName() 
             + "\nBadgeNumber: " + getBadge();
    }
}
