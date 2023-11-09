/*Day - 16

Pattern Printing

Hollow Rhombus using Alphabets

Input

5

Output:

    A B C D E
   A       E
  A       E
 A       E
A B C D E
*/
import java.util.*;
public class Day_16
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            char c = 65;
            for(int j=N-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<N;j++){
                if(i>0 && i<N-1){
                    if(j==0 || j==N-1){
                        System.out.print(c+" ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                else{

                    System.out.print(c+" ");

                }

                c++;
            }

            System.out.println("");
        }
    }
}
