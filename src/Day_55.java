/******************************************************************************

 Given an unsorted array of integers, sort the array into a wave array. An array arr[0..n-1] is sorted in wave form if:
 arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..

 Examples:

 Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
 Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80}
 Explanation:
 here you can see {10, 5, 6, 2, 20, 3, 100, 80} first element is larger than the second and the same thing is repeated again and again. large element – small element-large element -small element and so on .it can be small element-larger element – small element-large element -small element too. all you need to maintain is the up-down fashion which represents a wave. there can be multiple answers.

 Input: arr[] = {20, 10, 8, 6, 4, 2}
 Output: arr[] = {20, 8, 10, 4, 6, 2}

 *******************************************************************************/
public class Day_55
{
    public static void main(String[] args) {
        waveForm(new int[]{10,5,6,3,2,20,100,80},8);
    }
    static void waveForm(int[] arr, int n){
        int i=1;
        int last = arr[n-1];
        while(i<n){
            if(!(arr[i]<arr[i-1])){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] =temp;

            }
            if(i == n-1){
                arr[i] = last;
            }
            else{
                if(!(arr[i]<arr[i+1])){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            i+=2;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
