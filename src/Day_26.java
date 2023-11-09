/******************************************************************************

 Day -26

 Array Type Question


 Problem Statement:
 Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.
 If there is no such subarray that give the exact sum .print -1

 Note: There may be more than one subarray with sum as the given sum, print first such subarray.

 Test Case:1
 Input:
 arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
 Output:
 Sum found between indexes 2 and 4
 Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33

 Test Case:2
 Input
 : arr[] = {1, 4}, sum = 0
 Output: -1
 Explanation:
 There is no subarray with 0 sum.So print -1

 *******************************************************************************/
import java.util.*;
public class Day_26
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//size of the array
        int sum = sc.nextInt();// the sum
        int arr[] = new int[N];//to get the array elements
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }


        for(int i=0;i<N;i++){
            int res = 0;
            ArrayList<Integer> al = new ArrayList<>();
            for(int j=i;j<N;j++){
                al.add(arr[j]);
                res+=arr[j];
                if(res==sum){
                    for(int k:al){
                        System.out.print(k+" ");
                    }
                    return;
                }

            }

        }
        System.out.println(-1);

    }
}