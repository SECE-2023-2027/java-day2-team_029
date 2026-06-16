import java.util.LinkedList;
import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter n (position from the end): ");
        int n = sc.nextInt();

        if (n > 0 && n <= list.size()) {
            int indexToRemove = list.size() - n;
            list.remove(indexToRemove);

            System.out.println("List after removing the " + n +
                               "th element from the end:");
            System.out.println(list);
        } else {
            System.out.println("Invalid value of n.");
        }

        sc.close();
    }
}