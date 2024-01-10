import java.util.*;

public class Solution {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        // Write your code here
        int m = a.length;
        int n = b.length;
        int[] arr = new int[m + n];
        int k = 0;

        for (int i = 0; i < m; i++) {
            arr[k] = a[i];
            k++;
        }

        for (int j = 0; j < n; j++) {
            arr[k] = b[j];
            k++;
        }

        List<Integer> resultList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < m + n; i++) {
            set.add(arr[i]);
        }

        resultList.addAll(set);
        Collections.sort(resultList);

        return resultList;
    }
}
