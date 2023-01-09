//Power of 2
class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        if ( n <= 0 )           return false;
        else if ( n == 1 )      return true;
        else if ( n % 2 == 0 )  return isPowerofTwo( n / 2 );
                                return false;
    }
    
}
/*
Time Complexity:  O(log N)
Space Complexity: O(1)
*/