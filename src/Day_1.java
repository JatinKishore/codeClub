/*
1. Write a program to give the following output for the given input

Eg 1: Input: a1b10
       Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
          Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.
*/import java.util.*;
public class Day_1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String c = "";
        String num = "";
        for(int i=0;i<str.length()-1;i++){
            if(!Character.isLetter(str.charAt(i))){
                num+=str.charAt(i);
                if(Character.isLetter(str.charAt(i+1))){
                    for(int j=0;j<Integer.parseInt(num);j++){
                        System.out.print(c);
                    }
                    num="";
                    c="";

                }
                if(i+1 == str.length()-1){
                    num+=str.charAt(i+1);
                    for(int j=0;j<Integer.parseInt(num);j++){
                        System.out.print(c);
                    }
                }
            }
            else{
                c+=str.charAt(i);
                if(i+1 == str.length()-1){
                    num+=str.charAt(i+1);
                    for(int j=0;j<Integer.parseInt(num);j++){
                        System.out.print(c);
                    }
                }
            }
        }
    }
}
