//1175. Prime Arrangements
class Solution {
    public int numPrimeArrangements(int n) {
        boolean[] seen = new boolean[n+1];
        seen[1] = true;
        for ( int num = 2; num <= n; ++num )
        {
            if ( seen[num] ) continue;
            for ( long mul = (long)num * num; mul <= n; mul += num )
                seen[(int)mul] = true;
        }
        int comp = 0;
        int prime = 0;
        for ( int i = 1; i <=n ; ++i )
        {
            if ( seen[i] ) comp++;
            else prime++;
        }
        long m = 1000000007;
        long res = fact(prime) % m * fact(comp) % m;
        return (int)res;
    }
    public long fact(int n)
    {
        long m = 1000000007;
        long res = 1;
        for ( int i = 1; i <= n; ++i )
            res = (res * i) % m;
        return res;
    }
}
/*
Time Complexity:  O(nloglogn) Using sieve method
Space Complexity: O(n) For computing the primes
*/