/*
Day 11

Palindrome Triangle

Input :
6

Output:
          1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5
6 5 4 3 2 1 2 3 4 5 6
*/
import java.util.*;
public class Day_11
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=N-i;j>0;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i-j+1+" ");
            }
            for(int j=1;j<i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println("");

        }
    }
}
