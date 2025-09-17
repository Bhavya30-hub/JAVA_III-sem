import java.util.Scanner;
public class SumOfDigits 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bhavya Sangwan , 24csu039");

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int d1 = num / 100;        // hundreds 
        int d2 = (num / 10) % 10;  // tens 
        int d3 = num % 10;         // ones 

        int sum = d1 + d2 + d3;

        System.out.println("Sum of digits: " + sum);

        sc.close();
    }
}
