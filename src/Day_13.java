/*
DAY-13

Pattern Type Question

HOLLOW HOURGLASS Pattern

Input:
5

Output:

A B C D E F G H I
  A          G
    A      E
      A  C
        A
      A  C
    A      E
  A          G
A B C D E F G H I

*/

import java.util.*;
public class Day_13
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            char c = 65;
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            int indicate =0;
            for(int k=1;k<2*N;k++){
                if(i==1 ){
                    System.out.print(c++ + " ");
                }


                else if(k-i ==0 || 2*N-k-i ==0 ){
                    System.out.print(c++);
                    indicate = 1;
                }
                else{
                    System.out.print(" ");
                    if(indicate==1){
                        System.out.print(" ");
                        c++;
                    }
                }
            }
            System.out.println("");
        }
        for(int i=N-1;i>=1;i--){
            char c = 65;
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            int indicate =0;
            for(int k=1;k<2*N;k++){
                if(i==1 ){
                    System.out.print(c++ + " ");
                }


                else if(k-i ==0 || 2*N-k-i ==0 ){
                    System.out.print(c++);
                    indicate = 1;
                }
                else{
                    System.out.print(" ");
                    if(indicate==1){
                        System.out.print(" ");
                        c++;
                    }
                }
            }
            System.out.println("");
        }
    }
}
