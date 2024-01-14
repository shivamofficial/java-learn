import java.util.*;

public class Solution {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        // Write your code here.    

        int n = arr.length;
        int count = 0;

        // Calculate cumulative sum array
        int[] cumulativeSum = new int[n];
        cumulativeSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            cumulativeSum[i] = cumulativeSum[i - 1] + arr[i];
        }

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Calculate the sum of subarray using cumulative sum array
                int subarraySum = cumulativeSum[end] - (start > 0 ? cumulativeSum[start - 1] : 0);

                if (subarraySum == s) {
                    count++;
                }
            }
        }

        return count;
    }
}
