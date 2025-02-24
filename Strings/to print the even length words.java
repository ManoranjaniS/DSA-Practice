to print the even length words



import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Problemsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //String val[] = s.split(" ");
        for(String w:s.split(" ")){
            if(w.length()%2==0){
                System.out.println(w);
            }
        }

    }
}

