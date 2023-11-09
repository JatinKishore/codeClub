import java.util.*;
public class Day_6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        reverser(s);
    }
    static String reverser(String[] s){
        if(s.length==1){
            System.out.print(s[0]);
            return "";
        }
        System.out.print(s[s.length-1]+" ");
        String arrS[] = new String[s.length-1];
        for(int i=0;i<arrS.length;i++){
            arrS[i]=s[i];
        }
        return reverser(arrS);
    }
}
