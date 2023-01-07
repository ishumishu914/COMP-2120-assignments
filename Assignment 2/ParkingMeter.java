public class ParkingMeter 
{
    private int purchaseTime;

    public ParkingMeter(int parkTime)
    {
        purchaseTime = parkTime;
    }

    public void setPurchaseTime(int parkTime)
    {
        purchaseTime = parkTime;
    }

    public int getPurchaseTime()
    {
        return purchaseTime;
    }
}
