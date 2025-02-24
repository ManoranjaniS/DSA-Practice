second largest element in an array


Ans:
import java.util.Arrays;
import java.util.Scanner;
public class Learning {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
        int col=sc.nextInt();
        int [] [] arr = new int[row][col];
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] =sc.nextInt();
            }
        }
        int i;
        int j=0;
        int largest= arr[0][0];
        int slargest=-1;
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                if(arr[i][j]%2==0){
                    if(arr[i][j]>largest){
                        largest=arr[i][j];
                    }
                    if(arr[i][j]>slargest && arr[i][j]!=largest){
                        slargest=arr[i][j];
                    }
                }

            }

        }
        System.out.println(slargest);

    }
}
