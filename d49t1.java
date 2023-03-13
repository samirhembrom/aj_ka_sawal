//401. Binary Watch
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        for ( int h = 0; h < 12; ++h ){
            for ( int m = 0; m < 60; ++m ){
                if (Integer.bitCount(h)+
                Integer.bitCount(m) == turnedOn ){
                    if ( m < 10 ) list.add(String.format("%d:0%d",h,m));
                    else list.add(String.format("%d:%d",h,m));
                }
            }
        }
        return list;
    }
}
/*
Time Complexity: O(h*m) h is the hour and m is the minute
Space Complexity: O(n) No of combinations formed
*/