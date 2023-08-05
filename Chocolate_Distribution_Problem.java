class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long ans=Long.MAX_VALUE;
        for(int i=0; i<n-m+1 ;i++)
        {
            int j=i+m-1;
           
            if(a.get(j) - a.get(i) < ans )
            ans = a.get(j) - a.get(i);
        }
        return ans;
    }
}
