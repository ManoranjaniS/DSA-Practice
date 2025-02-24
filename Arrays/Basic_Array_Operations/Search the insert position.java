Search the insert position


import java.util.Arrays;
import java.util.Scanner;
public class problemsolving4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       int target = sc.nextInt();
        int index=0;
       for(int i=0;i<n;i++){
           if(arr[i]==target){
               System.out.println(i);
               break;
           }
           else{
               arr[n]=target;
               index=arr[i];
           }
           //System.out.println(Arrays.toString(arr));
       }
       Arrays.sort(arr);
        System.out.println(index);

    }
}
