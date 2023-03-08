//38. Count and Say
class Solution {
    public String countAndSay(int n) {
        if ( n == 1 ) return "1";
        String prev = countAndSay(n-1);
        StringBuilder str = new StringBuilder();
        int numDigit = 1;
        char curNum = prev.charAt(0);
        for ( int i = 1; i < prev.length(); ++i ){
            if ( curNum == prev.charAt(i) ) numDigit++;
            else {
                str.append(numDigit).append(curNum);
                numDigit = 1;
                curNum = prev.charAt(i);
            }
        }
        if ( numDigit > 0 ) str.append(numDigit).append(curNum);
        return str.toString();
    }
}
/*
Time Complexity: O(n) Linear time 
Space Complexity: O(n) To store the resultant string
*/