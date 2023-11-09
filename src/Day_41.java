/*
Day-41
Array Type Question

Maximum sum of i*arr[i] among all rotations of a given array

Given an array arr[] of n integers, find the maximum that maximizes the sum of the value of i*arr[i] where i varies from 0 to n-1.

Examples:

Input: arr[] = {8, 3, 1, 2}
Output: 29
Explanation: Lets look at all the rotations,
{8, 3, 1, 2} = 8*0 + 3*1 + 1*2 + 2*3 = 11
{3, 1, 2, 8} = 3*0 + 1*1 + 2*2 + 8*3 = 29
{1, 2, 8, 3} = 1*0 + 2*1 + 8*2 + 3*3 = 27
{2, 8, 3, 1} = 2*0 + 8*1 + 3*2 + 1*3 = 17

Input: arr[] = {3, 2, 1}
Output: 7
Explanation: Lets look at all the rotations,
{3, 2, 1} = 3*0 + 2*1 + 1*2 = 4
{2, 1, 3} = 2*0 + 1*1 + 3*2 = 7
{1, 3, 2} = 1*0 + 3*1 + 2*2 = 7*/

import  java.util.*;
public class Day_41 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int j=0;
        while(j != arr.length-1){
            int maxSum =0;
            int temp = arr[0];
            for(int i=0;i<N-1;i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length - 1] = temp;
            for(int k=0;k<N;k++){
                maxSum+=k*arr[k];
            }
            al.add(maxSum);
            j++;
        }
        System.out.println(Collections.max(al));
    }
}
