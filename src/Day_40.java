
/*
Find the Minimum element in a Sorted and Rotated Array

Given a sorted array arr[] (maybe distinct or may contain duplicates) of size N that is rotated at some unknown point, the task is to find the minimum element in it.

Examples:

Input: arr[] = {5, 6, 1, 2, 3, 4}
Output: 1
Explanation: 1 is the minimum element present in the array.

Input: arr[] = {1, 2, 3, 4}
Output: 1
*/
import java.util.*;
public class Day_40 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();//length
        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        MinimumFinder(arr, 0 , N);
    }
    static void MinimumFinder(int[] arr, int low, int high){
        if(arr[0] <= arr[high-1]){//if this condition is statisfied then the array is not rotately sorted
            System.out.println(arr[0]);
            return;
        }
        int mid = low/2 + high/2;//in rotated array the max and min element lies in the middle of the array.

        if(arr[mid]< arr[mid-1]){// check whether the arrived at the correct min element by comparing it with the before element(arr[mid -1]) no need of comparing arr[mid+1] since it will be greater than mid
            System.out.println(arr[mid]);

        }else{
            System.out.println(arr[mid-1]);
        }
    }
}
