/*Day-15

Pattern Type Question

Pascal's Triangle

input:
5

output:
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

Pascal 's Rule :
A Pascal’s Triangle is a triangular array of binomial coefficients where the nth row contains the binomial coefficients nC0, nC1, nC2, ……. nCn. The following example demonstrates one of the methods using which we can print Pascal’s Triangle Pattern.*/
import java.util.*;

public class Day_15
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=N-i;j>0;j--){
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++){
                System.out.print(Binomial_Combination(i,j)+" ");
            }
            System.out.println("");

        }
    }
    static int Binomial_Combination(int i,int j){
        int N=1;
        int R=1;
        int NR = i-j;
        int N_R =1;
        while(i!=0){
            N*=i;
            i--;
        }
        while(j!=0){
            R*=j;
            j--;
        }
        while(NR!=0){
            N_R*=NR;
            NR--;
        }
        return N/(R*N_R);

    }

}
