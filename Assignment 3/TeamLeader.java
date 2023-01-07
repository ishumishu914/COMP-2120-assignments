public class TeamLeader extends ProductionWorker
{
    private double bonus;
    private double r_trainingHours;
    private double a_trainignHours;

    public TeamLeader(String name, String employeeNum, String hireDate, int shift, double payRate, double bonus, double r_trainingHours, double a_trainignHours) {
        super(name, employeeNum, hireDate, shift, payRate);
        this.bonus = bonus;
        this.r_trainingHours = r_trainingHours;
        this.a_trainignHours = a_trainignHours;
    }

    public void setBonus(double bonus) 
    {
        this.bonus = bonus;
    }

    public double getBonus() 
    {
        return this.bonus;
    }

    public void setR_trainingHours(double r_trainingHours) {

        this.r_trainingHours = r_trainingHours;
    }

    public double getR_trainingHours() 
    {
        return this.r_trainingHours;
    }

    public void setA_trainignHours(double a_trainignHours) 
    {
        this.a_trainignHours = a_trainignHours;
    }

    public double getA_trainignHours() 
    {
        return this.a_trainignHours;
    }

    public String toString()
    {
        String s = super.toString();
        s += "\nMonthly Bonus: $" + getBonus() + 
             "\nRequired Training Hours: " + getR_trainingHours() +
             "\nTraining Hours Attended: " + getA_trainignHours();
        return s;
    }

}