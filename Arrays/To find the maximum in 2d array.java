To find the maximum in 2d array
ans:
import java.util.Scanner;
public class FIndElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  row size");
        int n = sc.nextInt();
        System.out.println("Enter a col size");
        int c = sc.nextInt();
        int a[][] = new int[n][c];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int max=a[0][0];
            for(  int i=1;i<n;i++){
                for (int j=0;j<c;j++){
                    if(a[i][j]>max){
                        max=a[i][j];
                    }
                }

            }
        System.out.println(max);
        }

    }

