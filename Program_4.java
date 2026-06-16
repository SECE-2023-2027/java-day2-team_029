import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Map<Character, Integer> countMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (countMap.get(str.charAt(i)) == 1) {
                System.out.println("Index of first unique character: " + i);
                break;
            }
        }

        sc.close();
    }
}