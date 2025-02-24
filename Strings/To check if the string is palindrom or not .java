To check if the string is palindrome or not
Ans:
import java.util.Scanner;

public class String1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1");
        String a=sc.next();
        String x=a;
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
              rev+=a.charAt(i);
        }
        if(a.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a plaindrome");
        }

    }
}
