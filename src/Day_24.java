/******************************************************************************

 Day-24

 Array Type Question

 Problem Statment:
 Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing,
 find the maximum element in the array.
 Note: If the array is increasing then just print the last element will be the maximum value.


 Input:
 N -> 5
 array[N] -> {5,7, 6, 20, 15,40}

 Output:
 [7,20]

 Explanation:
 The element 7 has neighbors 5 and 6, both of them are less than 7.
 The element 20 has neighbors 6 and 15, both of them are less than 20.

 *******************************************************************************/
import java.util.*;
public class Day_24
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            if(i == N-2){
                if(al.isEmpty()){
                    al.add(arr[N-1]);
                }
                break;
            }
            if(arr[i]<arr[i+1] && arr[i+2]<arr[i+1]){
                al.add(arr[i+1]);
            }
        }
        System.out.print(al);
    }
}
