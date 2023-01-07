public class ShipDemo 
{
    public static void main(String[] args) 
    {
        Ship[] ships = new Ship[]{
            new Ship("Lolipop", "1960"),
            new CruiseShip("Disney Magic", "1899", 2400),
            new CargoShip("Black Pearl", "1956", 50000)
        };

        for (int i = 0; i < ships.length; i++) 
        {
            System.out.println(ships[i].toString());
            System.out.println("--------------------------------");
        }
    }    
}
