/******************************************************************************

 *Day 23*

 Array Type Questions

 *Transpose Array*

 Input:
 5 -> N rows
 4 -> M columns


 1 1 1 1
 2 2 2 2
 3 3 3 3        -> matrix[N][M]
 4 4 4 4
 5 5 5 5

 Output
 1 2 3 4 5
 1 2 3 4 5       -> matrix[N][M]
 1 2 3 4 5
 1 2 3 4 5

 *******************************************************************************/
import java.util.*;
public class Day_23
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int j=0;j<M;j++){
            for(int i=0;i<N;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
