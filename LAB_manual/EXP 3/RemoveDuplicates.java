import java.util.Scanner;
public class RemoveDuplicates 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bhavya Sangwan , 24csu039 ");
        
        int[] arr = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        int[] temp = new int[5];
        int size = 0;
        for (int i = 0; i < 5; i++) 
        {
            boolean duplicate = false;
            for (int j = 0; j < size; j++) 
            {
                if (arr[i] == temp[j]) 
                {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) temp[size++] = arr[i];
        }
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < size; i++) System.out.print(temp[i] + " ");
        System.out.println();
        sc.close();
    }
}
