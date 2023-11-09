/******************************************************************************

 DAY-29

 Array Type Question

 Given an array of N integers, and an integer K, the task is to find the number of pairs of integers in the array whose sum is equal to K.

 Examples:

 Input: arr[] = {1, 5, 7, -1}, K = 6
 Output:  2
 Explanation: Pairs with sum 6 are (1, 5) and (7, -1).

 Input: arr[] = {1, 5, 7, -1, 5}, K = 6
 Output:  3
 Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).

 *******************************************************************************/
import java.util.*;
public class Day_29
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int K =sc.nextInt();
        int[] arr = new int[N];
        int count=0;
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            int sum=0;
            for(int j=i;j<N;j++){
                sum = arr[i] + arr[j];
                if(sum==K){
                    count++;
                }
            }

        }
        System.out.print(count);
    }
}
