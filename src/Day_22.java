/******************************************************************************

 Day - 22

 Pattern Type Question

 Walls are Weak Pattern

 Input:

 5
 5

 Output:
 0 0 0 0 0
 0 1 1 1 0
 0 1 2 1 0
 0 1 1 1 0
 0 0 0 0 0


 *******************************************************************************/
import java.util.*;
public class Day_22
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i =1;i<=N;i++){
            for(int j=1;j<=M;j++){
                System.out.print(minimumFinder(i-1,j-1,N-i,M-j) + " ");
            }
            System.out.println("");
        }
    }
    static int minimumFinder(int a,int b,int c,int d){
        int minA = a<b?a:b;
        int minB = c<d?c:d;
        return minA<minB?minA:minB;
    }
}
