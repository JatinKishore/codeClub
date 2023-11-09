public class Day_7 {

    public static void printSpiral(int n) {
        int[][] grid = new int[2*n-1][2*n-1];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < 2*n-1-i; j++) {
                grid[i][j] = n - i;
                grid[j][i] = n - i;
                grid[2*n-2-i][j] = n - i;
                grid[j][2*n-2-i] = n - i;
            }
        }

        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;  // Change this value to adjust the size of the spiral
        printSpiral(n);
    }
}
