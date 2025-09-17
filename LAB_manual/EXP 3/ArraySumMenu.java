import java.util.Scanner;
public class ArraySumMenu {
    static int sumAll(int[] arr) 
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        return sum;
    }
    static int sumAlternate(int[] arr) 
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) sum += arr[i];
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bhavya Sangwan , 24csu039 ");
        
        int[] arr = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();

        System.out.println("1. Sum of all elements");
        System.out.println("2. Sum of alternate elements");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        if (choice == 1) System.out.println("Sum: " + sumAll(arr));
        else if (choice == 2) System.out.println("Sum: " + sumAlternate(arr));
        else System.out.println("Invalid choice");
        sc.close();
    }
}
