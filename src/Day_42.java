/*
Minimum Number of Platforms Required for a Railway/Bus Station
Given the arrival and departure times of all trains that reach a railway station,
the task is to find the minimum number of platforms required for the railway station so that no train waits.
We are given two arrays that represent the arrival and departure times of trains that stop.

Examples:

Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}, dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
900 940 950 1100 1500 1800
9:10, 12:00, 11:20, 11:30, 19:00, 20:00

910 1120 1130 1200 1900 2000
Output: 3
Explanation: There are at-most three trains at a time (time between 9:40 to 12:00)

Input: arr[] = {9:00, 9:40}, dep[] = {9:10, 12:00}
Output: 1
Explanation: Only one platform is needed.
 */
import java.util.*;
public class Day_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        int[] dep = new int[N];

        for(int i=0;i<N;i++){
            String s = sc.next();
            String[] str = s.split(":");

            arr[i] = Integer.parseInt(str[0]+str[1]);
        }
        for(int i=0;i<N;i++){
            String s = sc.next();
            String[] str = s.split(":");

            dep[i] = Integer.parseInt(str[0]+str[1]);
        }
        int j=1;
        int k =0;
        int platform = 1;

        while(k< arr.length && j< arr.length){
            if(arr[j]>=dep[k] ){
                k++;
                j++;
            }else{
                j++;
                platform++;
            }
        }
        System.out.println(platform);

    }
}

