//1833. Maximum Ice Cream Bars
class Solution {
    public int maxIceCream(int[] costs, int coins) {
    int max = costs[0];
    for( int cost: costs )
        if ( cost > max ) max = cost;
    int freqCoin[] = new int[max+1];
    for( int cost: costs)
        freqCoin[cost]++;
    int iceCream = 0;
    for( int cost = 1; cost <= max; ++cost )
    {
        if( freqCoin[cost] == 0 ) continue;
        if( coins < cost   )        break;
        int count = Math.min(freqCoin[cost], coins/cost);
        coins -= cost * count;
        iceCream += count;
    }
    return iceCream;
    }
}

/*
Time Complexity:  O(n+m) We iterate through the array n and 
		      then we create a frequency array m over which 
		      we iterate once more
Space Complexity: O(m) for the storing the frequency of the coins
*/