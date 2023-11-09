/******************************************************************************

 Day - 18

 Pattern Type Questions

 Square Colab with X pattern.
(** The below patterns are not the exact one we expect due to some isseus in the
 compiler inorder to write comments we made such kind of pattern as output, I need you to run this program onece
 and find the exact pattern what we expect
 )
 Input (Even):
 8

 Output:
 \ * * * * * * /
 * \ * * * * / *
 * * \ * * / * *
 * * * \ / * * *
 * * * / \ * * *
 * * / * * \ * *
 * / * * * * \ *
/ * * * * * * \



 Input (Odd):
 7

 Output:
 \ * * * * * /
 * \ * * * / *
 * * \ * / * *
 * * * \ * * *
 * * / * \ * *
 * / * * * \ *
/ * * * * * \



 *******************************************************************************/
import java.util.*;
public class Day_18
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=1;j<=N;j++){
                if(j-1==i){
                    System.out.print("\\");
                }
                else if(N-i == j){
                    System.out.print("/");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
