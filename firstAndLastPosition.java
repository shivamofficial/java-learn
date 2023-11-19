import java.util.*;

import java.io.*;
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.



        
        // first occurrencesA

        int low=0;

        int high=n-1;

        int first=-1;

        while(low<=high){

            int mid=(low+high)/2;

            if(arr.get(mid)==k){

                first=mid;

                high=mid-1;

            }

            else if(arr.get(mid)<k) low=mid+1;

            else high=mid-1;

        }

 

        // last occurrences

        int low1=0;

        int high1=n-1;

        int last=-1;

        while(low1<=high1){

            int mid1=(low1+high1)/2;

            if(arr.get(mid1)==k){

                last=mid1;

                low1=mid1+1;

            }

            else if(arr.get(mid1)<k) low1=mid1+1;

            else high1=mid1-1;

        }

        int[] ans={-1,-1};

        ans[0]=first;

        ans[1]=last;

        return ans;
    }

};
