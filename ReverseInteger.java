class Solution {
    public int reverse(int x) {
        
        int sum=0;
        int rem;

        while(x!=0)
        {
            rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
    if(sum >Integer.MAX_VALUE || sum<Integer.MIN_VALUE)
    {
    return 0;
    }
    else
    {
        return (int) sum;
    }
    }
}
