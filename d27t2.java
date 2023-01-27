//345. Reverse Vowels of a String
class Solution {
    boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);
        if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            return true;
        return false;
    }
    void swap( char a[], int f , int s )
    {
        char temp = a[f];
        a[f] = a[s];
        a[s] = temp;
    }
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] arr = s.toCharArray();
        while ( start < end )
        {
            while ( start < s.length() && !isVowel(arr[start]) ) start++;
            while ( end >= 0 && !isVowel(arr[end]) ) end--;
            if( start < end ) swap(arr,start++,end--);
        }
        return new String(arr);
    }
}
/*
Time Complexity:  O(n) Linear time using two pointer approach.
Space Complexity: O(n) To store the result
*/