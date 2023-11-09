/******************************************************************************

 Day - 20

 Pattern Type Question

 Top to Bottom Triangle Formation using Numbers

 Input:
 5

 Output:
 1
 2 6
 3 7 10
 4 8 11 13
 5 9 12 14 15


 *******************************************************************************/
import java.util.*;
public class Day_20
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int q = i;
            int k =n;
            for(int j=1;j<=i;j++){
                System.out.print(q+" ");
                k--;
                q=q+k;
            }
            System.out.println("");
        }
    }
}
