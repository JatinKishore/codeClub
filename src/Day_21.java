/******************************************************************************

 Day-21
 Pattern Type Coding Question

 Zero-One Triangle Pattern

 Input:
 6

 Output:
 0
 1 0
 1 0 1
 0 1 0 1
 0 1 0 1 0
 1 0 1 0 1 0


 *******************************************************************************/
import java.util.*;
public class Day_21
{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int m=1;
        for(int i=0;i<N;i++){

            for(int j=0;j<=i;j++){
                m = m==1?0:1;
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
