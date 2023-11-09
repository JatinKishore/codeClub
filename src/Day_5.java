/*
Given two sorted arrays, merge them such that the elements are not repeated

Eg 1:
Input:
        M=8
        Array 1: 2,4,5,6,7,9,10,13
        N=10
        Array 2: 2,3,4,5,6,7,8,9,11,15

Output:
     Merged array: 2,3,4,5,6,7,8,9,10,11,13,15
*/
import java.util.*;
public class Day_5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[M+N];
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<M;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=M;i<M+N;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                arr[j] = arr[j]<arr[j+1]?arr[j]:arr[j+1]+arr[j] - (arr[j+1]=arr[j]);
            }

        }

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        if(arr[arr.length-2] != arr[arr.length -1 ]){
            System.out.print(arr[arr.length -1 ]);
        }

    }
}
