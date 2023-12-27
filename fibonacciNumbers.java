public class Solution {
    public static int[] generateFibonacciNumbers(int n) {
        if (n <= 0) {
            return new int[0];
        }

        int[] fibonacciNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            fibonacciNumbers[i] = fibonacci(i);
        }

        return fibonacciNumbers;
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // You can change this value to generate a different number of Fibonacci numbers
        int[] result = generateFibonacciNumbers(n);

        System.out.println("First " + n + " Fibonacci numbers:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
