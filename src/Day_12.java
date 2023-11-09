/*
 Day 12

Pattern Printing Question

Floyd’s Triangle

input:
4

output:
A
B C
D E F
G H I J

*/
import java.util.*;
public class Day_12
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char k = 65;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k++ +" ");
            }
            System.out.println("");
        }
    }
}
