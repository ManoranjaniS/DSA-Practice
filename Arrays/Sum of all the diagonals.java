Sum of all the diagonals


Ans:



import java.util.Arrays;
import java.util.Scanner;
public class Learning {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
                if ((i == 0 && j == col - 1) || (i == col - 1 && j == 0) || ((i == row / 2) && (j == col / 2))) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
