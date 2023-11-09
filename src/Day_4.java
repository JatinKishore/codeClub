/* Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.

Eg 1:Input:
        String 1: test123string
         String 2: 123
        Output: 4
Eg 2: Input:
        String 1: testing12
        String 2: 1234
        Output: -1

 */import java.util.*;
public class Day_4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
// 		if(!a.contains(b)){
// 		    System.out.print(-1);
// 		    return;
// 		}
// 		System.out.print(a.indexOf(b); //use this method for O(N) time complexity

        for(int i=0;i<a.length();i++){
            int k=0;
            for(int j=i;j<a.length();j++){
                if(a.charAt(j)!=b.charAt(k)){
                    break;
                }
                if(a.charAt(j)==b.charAt(k)){
                    k++;
                }
                if(k==b.length()){
                    System.out.print(i);
                    return;
                }
            }

        }
        System.out.print(-1);
    }
}
