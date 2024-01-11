class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 1]; // Increase the size by 1 to cover the missing number

        for (int i = 0; i <= n; i++) {
            arr[i] = i;
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            result ^= nums[i] ^ arr[i];
        }

        // XOR with the last element to account for the missing number
        result ^= arr[n];

        return result;
    }
}
