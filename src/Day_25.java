/******************************************************************************

 Day-25

 print the K'th Smallest and Largest number from an Array

 input:
 N->5
 K->2

 arr[N] -> [3,2,4,5,6]

 Output:
 3
 5

 Explanation:
 from the above array [3,2,4,5,6].. the Second smallest number is 3 and the second largest number is 5.

 *******************************************************************************/
import java.util.*;
public class Day_25
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println(arr[K-1]);
        System.out.println(arr[N-K]);

    }
    static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[i]>arr[i+1]){
                    arr[i] = arr[i] + arr[i+1] -(arr[i+1] = arr[i]);
                }
            }
        }
    }
}
