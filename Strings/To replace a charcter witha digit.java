To replace a charcter witha digit
Ans:
import java.util.Scanner;

public class String1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1");
        String s=sc.nextLine();
        String atr=s.replaceAll("\\D"," ");

        System.out.println(atr);
    }
}
