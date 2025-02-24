
Remove the duplicates



import java.util.Arrays;
import java.util.Scanner;
public class problemsolving4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i;
        int j = 0;
        Arrays.sort(arr);
       int target = sc.nextInt();
         int count=0;
        // int array2[]=new int[n];
        for (i = 0; i < n; i++) {
            if (arr[i] != target) {
                arr[count]=arr[i];
                count++;

            }

        }
        System.out.println(count);
    }
}
