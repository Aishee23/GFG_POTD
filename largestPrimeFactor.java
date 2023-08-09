class Solution{
    static long largestPrimeFactor(int N) {
        //prime factorization
        long n = 2;
        // loop till sqrt(N)
        while ((n * n) <=N)
            if (N % n == 0) 
                N /= n; 
            else
                n++; 
        return N;
    }
}
