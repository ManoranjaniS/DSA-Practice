to check the missing number



import java.util.*;
public class Problemsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int maxi=0;
        int val=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            val=(int)Math.max(sum,maxi);
            if(sum<0){
                sum=0;
            }
        }

        System.out.println(val);
    }
}

