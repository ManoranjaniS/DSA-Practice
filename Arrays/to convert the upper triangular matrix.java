to find the upper triangular matrix
ANs:
import java.util.Scanner;
public class MAtixSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of rows") ;
        int n=sc.nextInt();
        System.out.println("Enter a size of columns") ;
        int c=sc.nextInt();
        int a[][]=new int [n][c];
        for(int i=0;i<n;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int upper[][]=new int[n][c];
        for(int i=0;i<n;i++){
            for(int j=0;j<c;j++){
                if(i<=j){
                    upper [i][j]=a[i][j];

                }
                System.out.print(upper[i][j]+" ");

            }
            System.out.println();
        }


    }

}
