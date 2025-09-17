import java.util.Scanner;
public class ReverseNumber 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bhavya Sangwan , 24csu039");

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int d1 = num / 100;        
        int d2 = (num / 10) % 10;  
        int d3 = num % 10;         

        int rev = d3 * 100 + d2 * 10 + d1;

        System.out.println("Reversed number: " + rev);

        sc.close();
    }
}
