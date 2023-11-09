/*
Day-27

Array Type Question

Cyclically Rotate an array by one

Given an array, the task is to cyclically rotate the array clockwise by one time. 

Examples:  

Input: arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}

Input: arr[] = {2, 3, 4, 5, 1}
Output: {1, 2, 3, 4, 5}


*/
import java.util.*;
public class Day_27 {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=1;i<N;i++){
            arr[i] = sc.nextInt();
        }
        arr[0] = sc.nextInt();
        System.out.println(Arrays.toString(arr));

    }
}