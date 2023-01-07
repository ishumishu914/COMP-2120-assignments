//import javax.swing.JOptionPane;
import java.util.Scanner;  // Needed for the Scanner class

public class TemperatureDemo 
{
    public static void main(String[] args) 
    {
        double userTemp;

        /*input = JOptionPane.showInputDialog("Enter the Fahrenheit temperature: ");
        userTemp = Double.parseDouble(input);*/

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter the Fahrenheit temperature: ");
        userTemp = keyboard.nextDouble();
        keyboard.close();

        Temperature temp1 = new Temperature(userTemp);
        System.out.printf("Celcius: %.2f\n", temp1.getCelcius());
        System.out.printf("Kelvin: %.2f\n", temp1.getKelvin());
        
    }
}
