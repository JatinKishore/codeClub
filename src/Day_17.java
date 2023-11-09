/******************************************************************************
 Day - 17

 Pattern Type Questions

 Built a Right Side Aligned Right Angle Triangle using Alphabets

 Input

 5

 Output:
 A
 A B
 A B C
 A B C D
 A B C D E


 *******************************************************************************/
import java.util.*;
public class Day_17
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            char A = 65;
            for(int j=N-1;j>i;j--){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(A++ +" ");
            }
            System.out.println("");

        }
    }
}
