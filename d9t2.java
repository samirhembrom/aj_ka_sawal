//Sum of primes
class Solution{
    static int primeSum(int N){
        // code here
        int sum = 0;
        for( int temp = N; temp != 0; temp /= 10 )
        {
            int rem = temp % 10;
            if( rem == 2 || rem == 3 || rem == 5 || rem == 7 ) sum += rem;
        }
        return sum;
    }
}

/*
Time Complexity:  O(n)
Space Complexity: O(1)
*/