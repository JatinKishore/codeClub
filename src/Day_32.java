/*

DAY-32

Count subarrays with equal number of 1’s and 0’s

Given an array arr[] of size n containing 0 and 1 only. The problem is to count the subarrays having an equal number of 0’s and 1’s.

Examples:

Input: arr[] = {1, 0, 0, 1, 0, 1, 1}
Output: 8
Explanation: The index range for the 8 sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), (4, 5)(2, 5), (0, 5), (1, 6)

Input: arr = { 1, 0, 0, 1, 1, 0, 0, 1}
Output: 12
*/
import java.util.*;
public class Day_32
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<N;i++){
            for(int j =i;j<N;j++){
                int zero=0;
                int one =0;
                for(int k=i;k<=j;k++){
                    if(arr[k]==0){
                        zero++;
                    }
                    else{
                        one++;
                    }
                }
                if(zero==one){
                    count++;
                }
            }
        }
        System.out.println("The count is:"+ count);
    }
}
