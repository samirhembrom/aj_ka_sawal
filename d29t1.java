//557. Reverse Words in a String III
class Solution {
    public String reverseWords(String s) {
        int lastInd = -1;
        char[] arr = s.toCharArray();
        for ( int strInd = 0; strInd <= arr.length; ++strInd )
        {
            if ( strInd == arr.length || arr[strInd] == ' ' )
            {
                int startInd = lastInd  + 1;
                int endInd = strInd - 1;
                while ( startInd < endInd )
                {
                    char temp = arr[startInd];
                    arr[startInd] = arr[endInd];
                    arr[endInd] = temp;
                    startInd++;
                    endInd--;
                }
                lastInd = strInd;
            }
        }
        return new String(arr);
    }
}
/*
Time Complexity:  O(n) Linear Time(Two Pointer)
Space Complexity: O(1) No extra space was required just used temporary space for
			     output
*/