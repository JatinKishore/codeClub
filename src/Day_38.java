
/*
Day-38

Array Type - Question
Longest Consecutive Subsequence
        Given an array of integers, find the length of the longest sub-sequence
        such that elements in the subsequence are consecutive integers,
        the consecutive numbers can be ivḥn any order.

        Examples:

        Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
        1 2 3 4 9 10 20
        Output: 4
        Explanation: The subsequence 1, 3, 4, 2 is the longest subsequence of consecutive elements

        Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}
        Output: 5
        Explanation: The subsequence 36, 35, 33, 34, 32 is the longest subsequence of consecutive elements.

        Time Complexity : O(NlogN)

 */

import java.util.*;
public class Day_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<N;i++){
            arr[i]  = sc.nextInt();
        }

        quickSort(arr,0,N-1);

        System.out.println(Arrays.toString(arr));
        int count =1;
        for(int i=0;i<N-1;i++){
            if((arr[i+1] - arr[i]) == 1){
                count++;
            }else{
                al.add(count);
                count=0;
            }
        }
        if(al.isEmpty()){
            System.out.println(count);
        }else{
            System.out.println(Collections.max(al));
        }

    }
    static void quickSort(int[] arr, int low, int high){
        if(low>= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s/2 + e/2;
        int p = arr[m];

        if(s<=e){
            while(arr[s]<p){
                s++;
            }
            while(arr[e]>p){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr,low,e);
        quickSort(arr,s,high);

    }
}
