class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
    Arrays.sort(nums);
    //3 3 3 4 4 4  5 6 7 11 12 12 12
    ArrayList<Integer> ans =new ArrayList<Integer>();
    for(int i=1;i<n;i++)
    {
        if(nums[i]==nums[i-1])
        {
        ans.add(nums[i-1]);
        }
    }
    HashSet<Integer> set = new HashSet<>();
    set.addAll(ans);
ans.clear(); // delete array list
// add set to arraylist only 1 item present jo repeat hua

ans.addAll(set);

return ans;
    }
}
