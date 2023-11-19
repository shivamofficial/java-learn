class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        // Create a temporary array to store rotated elements
        int[] rotated = new int[n];

        // Copy elements to the rotated array
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        // Copy elements back to the original array
        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }
    }
}
