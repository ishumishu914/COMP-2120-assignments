public class ParkingTicketSimulator 
{
    public static void main(String[] args) 
    {
        ParkedCar car = new ParkedCar("Volkswagen", 1972, "Red", "147RHZM", 125);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("Joe Friday", 4788);
        ParkingTicket ticket = officer.writeTicket(car, meter);
        
        //if car is illegally parked then give ticket, else nothing
        if (officer.isIllegalParked(car, meter)) 
        {        
            ticket.calculateFine(); 
            System.out.println(ticket.toString());
        }
        else
        {
            System.out.println("no ticket!");
        }
    }
}
