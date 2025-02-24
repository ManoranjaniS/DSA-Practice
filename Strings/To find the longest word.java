To find the longest word
Ans:
import java.util.Scanner;

public class String1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1");
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        String longest=" ";
        for(String i:arr){
            if(i.length()>longest.length()){
                longest=i;//hello
            }
        }
        System.out.println("Longest is"+longest);

    }
}
