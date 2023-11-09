/******************************************************************************

 Find the max sum of elements within a contiguous subarray in the given array.
 Time Complexity:O(N)

 Input:
 5 -> array Size
 -1 -2 3 4 5 -> array elements

 Output:
 12

 Explanation:
 since the contiguous subarray {3,4,5} of index (2,4) has a maximum sum value..that is of 12 than other contiguous
 subarrays.

 *******************************************************************************/
import java.util.*;
public class Day_34
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K=0;
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int max=0;
        while(K<=arr.length){
            int n=0;
            int sum=0;
            int k=K;

            for(int i=n;i<k;i++){
                if(i==arr.length){
                    break;
                }
                sum+=arr[i];
                if(i==k-1){

                    max=sum>max?sum:max;
                    sum=0;
                    k++;
                    i=n++;
                }
            }
            K++;

        }
        System.out.println(max);
    }
}
