//2424. Longest Uploaded Prefix
class LUPrefix {
    int max = 0;
    Set<Integer> s; 
    public LUPrefix(int n) {
        s = new HashSet<>();
    }
    
    public void upload(int video) {
        s.add(video);
        while ( s.contains(max+1) ) max++;
    }
    
    public int longest() {
        return max;
    }
}
/*
Time Complexity: O(n) Linear Pass
Space Complexity: O(1) Constant Time
*/