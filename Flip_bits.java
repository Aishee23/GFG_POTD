class Solution {

    public static int maxOnes(int a[], int n) {
        
        int cnt=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]==1)
                {
                    cnt++;
                    a[i]=-1;
                }
            else
            a[i]=1;

        }
        return (cnt+kadanes(a,n)) ;
    }
    static int kadanes(int arr[], int n)
    {
        int sum =0; int max = Integer.MIN_VALUE;
        for(int i =0; i <n; i++)
        {
            sum+= arr[i];
            
            max = Math.max(max, sum);
            
            if(sum<0)
            sum=0;
        }
        return Math.max(max,0);
    }
}
