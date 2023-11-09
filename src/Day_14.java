/*Day 14

Inverted Full Pyramid using Alphabets

INPUT:
5

OUTPUT:
A B C D E F G H I
  A B C D E F G
    A B C D E
      A B C
        A

Explanation:

The triangle depends upon the input N,

You need to build a N lines of inverted triangle using alphabets in the above format .

The first line consist of 2N-1 elements and decreases in the upcoming lines byfollowing the above order.


*/
import java.util.*;
public class Day_14
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            char k = 65;
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int j=2*N-2*i;j>=0;j--){
                System.out.print(k++ +" ");
            }
            System.out.println("");

        }
    }
}
