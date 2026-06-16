public class Program_2 {

    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        int sum = 0;

        while (count < 100) {
            if (isPrime(number)) {
                sum += number;
                count++;
            }
            number++;
        }

        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}