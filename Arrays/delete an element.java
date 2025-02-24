Write a program to delete an element in the given array,
I/P: Array Size=5 ; Val[1,2,3,4,5],  pos:2
Ans:

import java.util.Scanner;
public class ArrayDelete {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            System.out.println("Enter the values");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the pos");
        int pos=sc.nextInt();
       if(pos>n){
           System.out.println("Invalid");
       }
       else{
           for(i=0;i<n;i++){
               if(i==pos-1){
                   continue;
               }
               else {
                   System.out.print(a[i] + " ");
               }
           }
       }

    }

}
