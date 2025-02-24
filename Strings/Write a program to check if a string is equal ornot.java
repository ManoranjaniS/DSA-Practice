Write a program to check if a string starts with "java" and ends with "Programming"
 Ans:
import java.util.Scanner;

public class String1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1");
        String a=sc.next();
        System.out.println(a.startsWith("Java"));
        System.out.println(a.endsWith("Programming"));
    }
}
