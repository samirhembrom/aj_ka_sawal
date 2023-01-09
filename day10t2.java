//Reverse words in a given string

class Solution 
{
    String reverseWords(String S)
    {
        String []arr = S.split("\\.");
        String res = "";
        for( int i = arr.length - 1; i >= 0; --i )
        {
            if( i == 0 )
            {
                res += arr[i];
                break;
            }
                
            res += arr[i] + ".";
        }
        return res;
    }
}

/*
Time Complexity:  O(n)
Space Complexity: O(n)
*/