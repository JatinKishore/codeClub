/*

Day-39
Array Type Question
Maximum Product Sub-array

Given an array that contains both positive and negative integers, the task is to find the product of the maximum product subarray.

Examples:

Input: arr[] = {6, -3, -10, 0, 2}
Output:  180
Explanation: The sub-array is {6, -3, -10}

Input: arr[] = {-1, -3, -10, 0, 60}
Output:   60
Explanation: The sub-array is {60}*/
import java.util.*;
public class Day_39 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt(); // length

        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int product = 1;
                for(int k=i;k<=j;k++){
                    product=arr[k];
                }
                al.add(product);
            }
        }
        System.out.println(Collections.max(al));
    }
}
