To check the 2 strings are equal
Ans:
import java.util.Scanner;

public class String1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1");
        String a=sc.next();
        System.out.println("Enter the string2");
        String b=sc.next();
        if(a.equals(b)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
