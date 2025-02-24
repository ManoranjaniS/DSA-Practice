    Reverse the words.




import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Problemsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String arr[]=new String[250];
        String s=sc.nextLine();
        String val=s.trim();
        String arr[]=s.split(" ");
        String rev="";
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]).append(" ");
        }
       // sb.reverse();
        System.out.print(sb.toString().trim());
    }
}