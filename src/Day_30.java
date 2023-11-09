/******************************************************************************
 DAY-30

 Array Tyoe Question
 Find the first repeating element in an array of integers

 Given an array of integers arr[],
 The task is to find the index of first repeating element in it
 i.e. the element that occurs more than once and whose index of the first occurrence is the smallest.

 Examples:

 Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
 Output: 5
 Explanation: 5 is the first element that repeats

 Input: arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}
 Output: 6
 Explanation: 6 is the first element that repeats

 *******************************************************************************/
import java.util.*;
public class Day_30
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]);
                    return;
                }

            }

        }
        System.out.print(-1);
    }

}
