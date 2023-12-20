public class Solution {
    public static String isPrime(int num) {
        // Your code goes here

        if (num <= 1) {
            return "NO"; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "NO"; // If num is divisible by i, it's not a prime number
            }
        }

        return "YES"; // If no divisor is found, the number is prime
    }
}
