/******************************************************************************

 DAY-36

 Find the contigous subarray of sum equal to the target in the given array. Print the indices of each subarray.
 Time Complexity: O(N^2)
 Input :
 5
 5
 1 2 3 4 5

 Output:
 (4,4) , (1,2)
 *******************************************************************************/
import java.util.*;
public class Day_36
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[N];
        int K =0;
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        while(K<=arr.length){
            int n=0;
            int k=K;
            int sum=0;
            for(int i=n;i<k;i++){
                if(i==arr.length){
                    break;
                }
                sum+=arr[i];
                if(i==k-1 ){
                    if(sum==target){
                        System.out.print("("+n+","+ (k-1) +")");
                    }
                    sum=0;
                    k++;
                    i=n++;
                }
            }
            K++;
        }
    }
}
