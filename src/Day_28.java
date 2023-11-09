/******************************************************************************

 Day-28

 Array Type Question

 Find The Missing Numbers*  in range (1,N)
 in O(N) time complexity

 input:
 5
 arr= {4,4,3,4,5}

 output:
 1 2

 *******************************************************************************/
import java.util.*;
public class Day_28
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int i=0;
        while(i<n){
            int c = arr[i]-1;
            if(arr[i]!=arr[c]){
                arr[i] = arr[i]+arr[arr[i]-1] - (arr[arr[i]-1]=arr[i]);
            }
            else{
                i++;
            }

        }

        for(int k=0;k<n;k++){
            if(arr[k]-1!=k){
                System.out.print(k+1+" ");

            }
        }
    }
}
