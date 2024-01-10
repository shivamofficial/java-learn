public class Solution {
    public static int secondlargest(int[] a, int n) {
        int largest = a[0];
        int slargest = -1;
        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                slargest = largest;
                largest = a[i];
                //Else if the current element is larger than ‘second_large’ then we update the variable second_large.
            } else if (a[i] > slargest || slargest == -1) {
                slargest = a[i];
            }
        }
        return slargest;
    }

    public static int secondsmallest(int[] a, int n) {
        int smallest = a[0];
        int ssmallest = -1;
        for (int i = 1; i < n; i++) {
            if (a[i] < smallest) {
                ssmallest = smallest;
                smallest = a[i];
            } else if (a[i] < ssmallest || ssmallest == -1) {
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }

    public static int[] getSecondOrderElements(int n, int[] a) {
        int slargestele = secondlargest(a, n);
        int ssmallestele = secondsmallest(a, n);
        int[] arr = { slargestele, ssmallestele };
        return arr;
    }
}
