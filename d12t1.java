//2255. Count Prefixes of a Given String

class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for( int i = 0; i < words.length; ++i )
        {
            int j = 0;
            String word = words[i];
            if( word.length() <= s.length() )
            {
                int f = 0;
                while( j < word.length() && j < s.length() )
                {
                    if( word.charAt(j) != s.charAt(j) )
                    {
                        f = 1;
                        break;
                    }
                    j++;
                }
                if( f == 0 )
                    count++;
            }
        }
        return count;
    }
}

/*
Time Complexity:  O(n*m) N is the length of the array and m the maximum 
			length of the string present in array 
Space Complexity: O(m) m is for the string
*/