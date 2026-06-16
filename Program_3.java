import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() >= 1 && str2.length() >= 1) {
            String result = str1.substring(1) + str2.substring(1);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Both strings must have at least 1 character.");
        }

        sc.close();
    }
}