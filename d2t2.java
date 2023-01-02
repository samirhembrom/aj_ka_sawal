//Remove vowels from string

class Solution {
    String removeVowels(String S) {
        return S.replaceAll("[aeiouAEUIOU]","");
    }
}
/*
Time Complexity: O(n) 
Space Complexity: O(1)
*/