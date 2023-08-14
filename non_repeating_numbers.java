class Solution
{
     public int[] singleNumber(int[] arr)
    {
        // code here
        int N=arr.length;
        Map<Integer, Integer> map = new TreeMap<>();
        
        for(int i =0; i<N; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        
        int ans[] = new int[2]; int k=0;
        
        for(int x : map.keySet())
        {
            if(map.get(x)%2!=0)
            {
                ans[k++] = x;
            }
        }
        return ans;
    }
}
