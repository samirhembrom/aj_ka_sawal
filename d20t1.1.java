//204. Count Primes
class Solution {
    public int countPrimes(int n) {
        boolean primes[] = new boolean[n];
        int count = 0;
        for ( int num = 2; num < n; ++num )
        {
            if ( primes[num] ) continue;
            count++;
            for ( long mul = (long)num * num; mul < n; mul += num )
                primes[(int)mul] = true;
        }
        return count;
    }
}
/*
Time Complexity:  O(n*log(log n) Using Sieve of Eratosthenes
Space Complexity: O(n) Extra space to store the prime values
*/