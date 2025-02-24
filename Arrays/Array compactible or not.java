to check if the arrays are compactible or not
Ans:
import java.util.Scanner;
public class Compactibleorincompactible {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size");
        int n=sc.nextInt();
        System.out.println("enter a size");
        int s=sc.nextInt();
        if(n==s){
            int [] a=new int[n];
            int [] b=new int[s];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int j=0;j<s;j++){
                b[j]=sc.nextInt();
            }
            for(int k=0;k<a.length;k++){
                for(int l=0;l<b.length;l++) {
                    if (a[k] > b[l]) {
                        System.out.println("compactible");
                    } else {
                        System.out.println("incompactible");
                    }
                }
            }
        }
        else{
            System.out.println("invalid");
        }



    }

}
