To find the transpose of a matrix
Ans:
import java.util.Scanner;
public class FIndElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  row size");
        int n = sc.nextInt();
        System.out.println("Enter a col size");
        int c = sc.nextInt();
        System.out.println("Eter the values" + " ");
        int a[][] = new int[n][c];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int trans[][]=new int[n][c];
        for (int i = 0; i < n; i++) {
            for ( int j = 0; j < c; j++) {
                trans[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }

    }
}
