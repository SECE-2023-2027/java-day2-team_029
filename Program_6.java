import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to remove: ");
        int value = sc.nextInt();

        int newLength = 0;

        // Move non-target elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != value) {
                arr[newLength] = arr[i];
                newLength++;
            }
        }

        System.out.println("Updated array length: " + newLength);

        System.out.print("Updated array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}