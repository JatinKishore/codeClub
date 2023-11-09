/*Day:10

Pattern Question:

Input:
5

Output:
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/
import java.util.*;
public class Day_10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<N-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<N-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=N-1;i>=0;i--){
            for(int j=0;j<N-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=N-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
