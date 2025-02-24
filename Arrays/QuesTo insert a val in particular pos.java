Ques:To insert a val in particular pos


ANs:


import java.util.Scanner;
public class problemsolving4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("ente the pos");
        int pos=sc.nextInt();
        System.out.println("enter the val");
        int val=sc.nextInt();
        for(int i=0;i<n;i++){
            if(pos<arr.length){
                arr[pos]=val;
            }
            System.out.println(arr[i]);
        }

    }
}