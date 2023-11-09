/******************************************************************************

 DAY-31

 Array Type Question

 Find first non-repeating element in a given Array of integers
 Given an array of integers of size N, the task is to find the first non-repeating element in this array.

 Examples:

 Input: {-1, 2, -1, 3, 0}
 Output: 2
 Explanation: The first number that does not repeat is : 2

 Input: {9, 4, 9, 6, 7, 4}
 Output: 6

 *******************************************************************************/
import java.util.*;
public class Day_31
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr  = new int[N];
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            int flag=0;
            for(int j=i+1;j<N;j++){
                if(arr[i]==arr[j]){
                    flag=1;
                    al.add(arr[i]);
                    break;
                }
            }
            if(flag==0){
                if(!al.contains(arr[i])){
                    System.out.print(arr[i]);
                    return;
                }

            }
        }
        System.out.print(-1);
    }
}
