/******************************************************************************

 Subarray with 0 sum

 Given an array of positive and negative numbers,
 the task is to find if there is a subarray (of size at least one) with 0 sum.

 Examples:

 Input: {4, 2, -3, 1, 6}
 Output: true
 Explanation:
 There is a subarray with zero sum from index 1 to 3.

 Input: {4, 2, 0, 1, 6}
 Output: true
 Explanation: The third element is zero. A single element is also a sub-array.

 *******************************************************************************/
import java.util.*;
public class Day_33
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum==0){
                    System.out.print(i+" "+j);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
