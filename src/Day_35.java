/******************************************************************************

 DAY-35

 Array Type Question

 Find the min sum of elements within a contiguous subarray in the given array.
 Time Complexity:O(N)

 Input:
 5 -> array Size
 -1 -2 3 4 5 -> array elements

 Output:
 -3

 Explanation:
 since the contiguous subarray {-1,-2} of index (0,1) has a minimum sum value..that is of -3 than other contiguous
 subarrays.

 *******************************************************************************/
import java.util.*;
public class Day_35
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K=0;
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int min=0;
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

                    min=sum<min?sum:min;
                    sum=0;
                    k++;
                    i=n++;
                }
            }
            K++;

        }
        System.out.println(min);
    }
}
