finding missing num in array



import java.util.*;
public class Stringhandllying1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int val=(n*(n+1))/2;
        int ac=0;
        for(int i=0;i<n;i++){
            ac+=arr[i];
        }
        int m=val-ac;
        System.out.println(m);
    }
  