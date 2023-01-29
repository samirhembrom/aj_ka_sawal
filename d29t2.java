//Modified Numbers and Queries
class Solution
{
    public int sumOfAll(int l, int r)
    {
        boolean[] seen = new boolean[r+1];
        for (int num = 2; num <= r; ++num)
        {
            if( seen[num] ) continue;
            for ( long mul = (long)num * num; mul <= r; mul += num )
                seen[(int)mul] = true;
        }
        int sum = 0;
        for ( int i = l; i <= r; ++i )
        {
            if ( i == 1 ) continue;
            if ( !seen[i] ) sum += i;
            else
            {
                for (int num = 2; num <= i/2 ; ++num)
                {
                    if( !seen[num] && i % num == 0) sum += num;
                }
            }
        }
        return sum;
    }
}
/*
Time Complexity:  O(nloglogn) Using sieve of Eratosthenes
Space Complexity: O(n) For computing the primes
*/