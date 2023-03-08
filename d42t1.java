//Balloon Everywhere
class Solution {
    public int maxInstance(String s) {
        // Code here
        int[] arr = new int[26];
        for ( int i = 0; i < s.length(); ++i )
            arr[s.charAt(i)-'a']++;
        int count = Integer.MAX_VALUE;
        count = Math.min(arr['b'-'a'],count);
        count = Math.min(arr['a'-'a'],count);
        count = Math.min(arr['l'-'a']/2,count);
        count = Math.min(arr['o'-'a']/2,count);
        count = Math.min(arr['n'-'a'],count);
        return count;
    }
}
/*
Time Complexity:  O(n) Linear Time
Space Complexity: O(26) Store the count of the alphabets
*/