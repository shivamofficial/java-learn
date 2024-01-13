  int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;
 
        // Count the number of 0s, 1s and 2s in the array
        for (i = 0; i < n; i++) {
            switch (arr[i]) {
            case 0:
                cnt0++;
                break;
            case 1:
                cnt1++;
                break;
            case 2:
                cnt2++;
                break;
            }
        }
 
        // Update the array
        i = 0;
 
        // Store all the 0s in the beginning
        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }
 
        // Then all the 1s
        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }
 
        // Finally all the 2s
        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }

--------------------------------------------------------------2 option ------------------------------DNF sort way ----------




import java.util.*;

public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n - 1; // 3 pointers

        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;

            } else if (arr.get(mid) == 1) {
                mid++;

            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;
            }
        }
    }

    public static void main(String args[]) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }

}
