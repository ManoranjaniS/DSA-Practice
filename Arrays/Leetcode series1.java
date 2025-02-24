Leetcode series



Two Sum

import java.util.Arrays;
import java.util.Scanner;
public class problemsolving4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i;
        int j = 0;
        System.out.println("Target");
        int target=sc.nextInt();
        int array2[]=new int[2];
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                  array2[0]=i;
                  array2[1]=j;
                  System.out.println(Arrays.toString(array2));
                  break;
                }
            }
        }
        //System.out.println(Arrays.toString();
    }

}