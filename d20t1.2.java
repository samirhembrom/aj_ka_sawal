//A. Noldbach problem
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        if  ( k == 0 )
        {
            System.out.println("YES");
            return;
        }
        boolean[] seen = new boolean[n];
        for ( int num = 2; num < n; ++num )
        {
            if ( seen[num] ) continue;
            for ( long mul = (long)num * num; mul < n; mul += num )
                seen[(int)mul] = true;
        }
        int f = -1, s = -1;
        int count = 0;
        for ( int i = 2; i < n; ++i )
        {
            if( !seen[i] )
            {
                f = s;
                s = i;
                int sum = f + s + 1;
                if ( sum < n && !seen[sum] ) count++;
                if ( count == k )
                {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
/*
Time Complexity:  O(n*log(log n) Using Sieve of Eratosthenes
Space Complexity: O(n) Extra space to store the prime values
*/