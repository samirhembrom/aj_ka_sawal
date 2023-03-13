//1850. Minimum Adjacent Swaps to Reach the Kth Smallest Number
class Solution {
    public int getMinSwaps(String num, int k) {
        char[] target = num.toCharArray();
        for ( int i = 0; i < k; ++i )
            nextPerm(target);
        char[] nums = num.toCharArray();
        return minSwap(nums,target,num.length());
    }
    public void reverse( char[] arr, int i ){
        int j = arr.length-1;
        while ( i < j ){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public void swap( char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void nextPerm( char[] arr){
        if ( arr.length == 0 ) return;
        int len = arr.length;
        for ( int i = len-1; i >= 1; --i ){
            if ( arr[i] > arr[i-1] ){
                reverse(arr,i);
                for ( int j = i; j < len; ++j ){
                    if ( arr[j] > arr[i-1] ){
                        swap(arr,j,i-1);
                        return;
                    }
                }
            }
        }
        reverse(arr,0);
    }
    public int minSwap( char[] num, char[] target, int n){
        int j = 0, swap = 0;
        for ( int i = 0; i < n; ++i ){
            j=i;
            while ( num[j] != target[i] )j++;
            while ( i < j ){
                swap(num,j,j-1);
                j--;
                swap++;
            }
        }
        return swap;
    }
}
/*
Time Complexity:  O(n^2) Quadratic Time
Space Complexity: O(n) To store a duplicate num
*/