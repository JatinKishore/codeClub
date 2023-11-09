/*
The program must accept a string S containing multiple words as the input. The program must form a new string W based on the following conditions. -The number of words in S and W must be equal. -The length of each word in S and W must be equal. -The alphabets in W must be filled word by word from the alphabets in S.

Finally, the program must print the string W as the output.

Boundary Condition(s):

3 Length of S<= 1000

1< Length of each word in S<= 20

Input Format:

The first line contains multiple words separated by a space

Output Format:

The first line contains multiple words separated by a space.

Example Input/Output 1:

Input:
a bc def ghij kl mnopq rs

Output:
a bh cin djoq ek flprs gm

Explanation:

Here the string S is a bc def ghij kl mnopq rs
The way the string W formed is given below.

a b c d e f g
a bh ci dj ek fl gm
a bh cin djo ek flp gm
a bh cin djoq ek flpr gm
a bh cin djoq ek flprs gm
*/

import java.util.*;
public class Day_9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = str.replace(" ","");
        String[] arrS1 = str.split(" ");
        String[] arrS2 = new String[arrS1.length];
        for (int i = 0; i < arrS2.length; i++) {
            arrS2[i] = "";
        }
        int k=0;
        for(int i=0;i<str2.length();i++){
            for(int j=0;j<arrS2.length;j++){
                if(arrS2[j].length() != arrS1[j].length()){
                    arrS2[j]+=str2.charAt(k);
                    k++;
                }
            }
        }
        for(String i : arrS2){
            System.out.print(i+" ");
        }
    }
}
