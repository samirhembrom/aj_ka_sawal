//Numbers containing 1, 2 and 3
public static void findAll()
{
    for ( int i = 1; i < 1000000; ++i ){
        int num = i;
        boolean f = false;
        while ( num != 0 ){
            int rem = num % 10;
            if ( rem != 1 && rem != 2 && rem != 3 ) {
                f = true;
                break;
            }
            else{
                num /= 10;
            }
        }
        if ( !f ) mp.put(i,0); 
    }
}
/*
Time Complexity: O(n) Linear Time
Space Complexity: O(n) To store the map value
*/