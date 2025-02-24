To reverse a string
ans:
import java.util.Scanner;

public class String1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1");
        String a=sc.next();
        String rev=" ";
        for(int i=a.length()-1;i>=0;i--){
            rev+=a.charAt(i);
        }
        System.out.println(rev);
    }
}
