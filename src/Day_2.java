/*3. Write a program to print the following output for the given input. You can assume the string is of odd length

Eg 1: Input: 12345
       Output:
1       5
  2   4
    3
  2  4
1      5
Eg 2: Input: geeksforgeeks
         Output:
g                         s
  e                     k
    e                 e
      k             e
        s         g
          f      r
             o
          f     r
        s         g
      k             e
    e                 e
  e                      k
g                          s */
import java.util.*;
public class Day_2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(i==j || i+j==str.length()-1){
                    System.out.print(str.charAt(j));
                }
                else{
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }
}
