//2114. Maximum Number of Words Found in Sentences
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = Integer.MIN_VALUE;
        for ( String sentence : sentences )
        {   
            int wordCount = 0;
            for ( int i = 0; i < sentence.length(); ++i )
                if ( sentence.charAt(i) == ' ' ) wordCount++;
            if ( ++wordCount > maxWords ) maxWords = wordCount;
        }
        return maxWords;
    }
}
/*
Time Complexity :  O(n*k) where n is the length of the array and 
			 k is the length of the string 
Space Complexity:  O(1) No extra space required. 
*/