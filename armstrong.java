import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        int sum = 0;
        int rem;
        int temp = n; // Store the original value of n

        while (n > 0) {
            n = n / 10;
            count++;
        }

        n = temp; // Reset n to its original value

        while (n > 0) {
            rem = n % 10;
            sum = sum + (int) Math.pow(rem, count);
            n = n / 10;
        }

        if (sum == temp) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
