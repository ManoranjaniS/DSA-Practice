selection Sort


import java.util.Arrays;
import java.util.Scanner;
public class Problem452 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //selction sort
        int mini;
        for(int i=0;i<n-1;i++){
            mini=i;
            for(int j=i+1;j<n;j++) {
                if (arr[j] <arr[ mini]) {
                    mini = j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
             arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            break;
        }
    }
}
