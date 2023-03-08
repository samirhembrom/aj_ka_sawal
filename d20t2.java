import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n+1];
            for ( int i = 1; i <= n; ++i )
                arr[i] = sc.nextInt();

            int[] pre = new int[n+2];
            int[] pos = new int[n+2];
            pre[0] = 0;
            pre[1] = arr[1];
            for ( int i = 2; i <= n; ++i )
                pre[i] = gcd(pre[i-1],arr[i]);
            pos[n+1] = 0;
            pos[n] = arr[n];
            for ( int i = n - 1; i >= 1; --i )
                pos[i] = gcd(pos[i+1],arr[i]);

            for ( int i = 0; i < q; ++i )
            {
                int l = sc.nextInt();
                int r = sc.nextInt();
                System.out.println(gcd(pre[--l],pos[++r]));
            }

        }
    }
    private static int gcd( int x, int y)
    {
        if ( y == 0 ) return x;
        return gcd(y,x%y);
    }
}
