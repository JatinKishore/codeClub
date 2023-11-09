/*
Bitonic Generator Sort
EasyAccuracy: 46.65%Submissions: 6K+Points: 2
Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

Given an array arr[] of N distinct numbers, the task is to sort all even-placed numbers in increasing and odd-place numbers in decreasing order. The modified array should contain all sorted even-placed numbers followed by reverse sorted odd-placed numbers.
Note that the first element is considered as even because of its index 0.

Example 1:

Input: N = 8
arr[] = {0, 1, 2, 3, 4, 5, 6, 7}
Output: 0 2 4 6 7 5 3 1
Explanation: 
Even-place elements : 0, 2, 4, 6
Odd-place elements : 1, 3, 5, 7
Even-place elements in increasing order : 
0, 2, 4, 6
Odd-Place elements in decreasing order : 
7, 5, 3, 1
Example 2:

Input: N = 9
arr[] = {3, 1, 2, 4, 5, 9, 13, 14, 12}
Output: 2 3 5 12 13 14 9 4 1
Explanation: 
Even-place elements : 3, 2, 5, 13, 12
Odd-place elements : 1, 4, 9, 14
Even-place elements in increasing order : 
2, 3, 5, 12, 13
Odd-Place elements in decreasing order : 
14, 9, 4, 1

Your Task:
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function bitonicGenerator() that takes array arr and integer N as parameters and modify the array according to the above condition.

Expected Time Complexity: O(NlogN).
Expected Auxiliary Space: O(N).

 

Constraints:
1 ≤ N ≤ 105


*/import java.util.*;
public class Day_3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0;i<N;i++){
            int j = sc.nextInt();
            if(i%2==0){
                even.add(j);
            }
            else{
                odd.add(j);
            }
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        for(int i : even){
            System.out.print(i+" ");
        }
        for(int i:odd){
            System.out.print(i+" ");
        }
    }
}
/*
O(n log n)	The code snippet has a loop that iterates N times, where N is the input value. Inside the loop, there are two operations that have a time complexity of O(1): adding an element to an ArrayList and checking if a number is even or odd. However, the sorting operations performed on the ArrayLists have a time complexity of O(n log n), where n is the size of the ArrayList. Therefore, the overall time complexity of the code snippet is O(n log n) due to the sorting operations.	7/21/23 13:13
*/