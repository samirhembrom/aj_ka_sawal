//1013. Partition Array Into Three Parts With Equal Sum
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
    int sum = 0, n = arr.length;
    for ( int i = 0; i < n; ++i ) sum += arr[i];
    if ( sum % 3 != 0 ) return false;
    int partSum = sum / 3, part = 0;
    sum = 0;
    for ( int i = 0; i < n; ++i ){
        sum += arr[i];
        if ( sum == partSum && part < 2 && i != n-1 ){
            part++;
            sum = 0;
        }
    }
    if ( sum == partSum ) part++;
    return part == 3;
    }
}
/*
Time Complexity:  O(n) Linear Time
Space Complexity: O(1) No extra space required
*/