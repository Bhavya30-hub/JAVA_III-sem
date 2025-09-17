import java.util.Scanner;
public class Rhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bhavya Sangwan , 24csu039");
        char choice;
        do {
            System.out.print("Enter number of rows: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.print("Do you want to try again? (Y/N): ");
            choice = sc.next().charAt(0);
        } while (choice != 'N' && choice != 'n');
        sc.close();
    }
}


