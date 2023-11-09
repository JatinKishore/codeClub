/******************************************************************************

 Day - 19

 Pattern Type Question

 Corner to Corner Triangle formation using Numbers

 Input:
 5

 Output:
 1
 6 2
 10 7 3
 13 11 8 4
 15 14 12 9 5


 *******************************************************************************/
import java.util.*;
public class Day_19
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num =N;
        int num2 = N;
        int num3 = 1;
        for(int i=1;i<=N;i++){
            int k = num2;
            System.out.print(num3+" ");
            int q = num3;
            for(int j=2;j<=i;j++){
                q = q - k;
                System.out.print(q +" ");
                k++;

            }
            System.out.println("");
            num3 = num+num3;
            num--;
            num2--;
        }
    }
}
