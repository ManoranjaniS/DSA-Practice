Search in array


import java.util.*;
public class Stringhandllying1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int tar=sc.nextInt();
        boolean keyfound=false;
        for(int i=0;i<n;i++){
            if(arr[i]==tar){
                keyfound=true;
                System.out.print(i);
            }
        }
        if(!keyfound){
            System.out.println("-1");
        }
    }
    }