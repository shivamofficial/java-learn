class Solution {
    static int evenlyDivides(int n) {
        int count = 0;
        int originalNumber = n; // Store the original number for comparison
        int rem;

        while (n > 0) {
            rem = n % 10; // Extract the last digit
            // Check if rem is not zero and divides the original number evenly
            if (rem != 0 && originalNumber % rem == 0) {
                count++;
            }
            n = n / 10; // Remove the last digit
        }

        return count;
    }
}
