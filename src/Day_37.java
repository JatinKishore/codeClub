/*Factorial of a large number

input :
100

output:
100
93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000
*/import java.util.*;
public class Day_37 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        factorial(N);
    }

    static void factorial(int n)
    {
        int[] res = new int[500];


        res[0] = 1;
        int res_size = 1;


        for (int x = 2; x <= n; x++)
            res_size = multiply(x, res, res_size);


        for (int i = res_size - 1; i >= 0; i--)
            System.out.print(res[i]);
    }

    static int multiply(int x, int res[], int res_size)
    {
        int carry = 0;


        for (int i = 0; i < res_size; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;

            carry = prod / 10;
        }


        while (carry != 0) {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }


}

