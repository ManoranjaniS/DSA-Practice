given an array to n positions do swap those elements with those 2 positions if the pos  mentioned exceeds limit of index print invalid.
take a array of elemets.


Ans:
import java.util.Scanner;
public class learning {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size+1];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }int temp;
        System.out.println("enter the pos");
        int p1=sc.nextInt();
        System.out.println("enter the pos");
        int p2=sc.nextInt();
        int i;
        if(p1>arr.length || p2>arr.length ){
            System.out.println("invalid");
        }

        for(i=0;i<size;i++){
            temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
        }
        for(int j=0;j<size;j++){
            System.out.print(arr[j]+" ");
        }

    }

}
