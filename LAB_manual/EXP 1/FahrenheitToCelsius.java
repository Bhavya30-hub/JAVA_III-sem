import java.util.Scanner;
public class FahrenheitToCelsius 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bhavya Sangwan , 24csu039");

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        double c = ((f - 32) * 5) / 9;

        System.out.println("Temperature in Celsius: " + c);

        sc.close();
    }
}
