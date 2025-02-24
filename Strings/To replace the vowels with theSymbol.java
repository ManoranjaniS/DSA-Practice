To replace the vowels with the * symbol
Ans:
import java.util.Scanner;

public class String1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1");
        String s=sc.nextLine();
        String atr=s.replaceAll("[aeiouAEIOU]","*");

        System.out.println(atr);
    }
}
