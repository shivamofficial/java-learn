
class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
       // code here
        ArrayList<Integer> aa = new ArrayList<Integer>();
       Arrays.sort(arr);
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                aa.add(arr[i-1]);
            }
        }
        //int last = list.get(list.size() - 1);
         Set<Integer> set = new LinkedHashSet<>();
    set.addAll(aa);

    // delete al elements of arraylist
   aa.clear();

    // add element from set to arraylist
    aa.addAll(set);
        if(aa.size()==0)
        {
            aa.add(-1);
        }
        return aa;
    }
}
